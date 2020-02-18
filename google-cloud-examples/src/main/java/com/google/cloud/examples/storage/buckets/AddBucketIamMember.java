/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.storage.buckets;

// [START storaoe_add_bucket_iam_member]
import com.google.cloud.Identity;
import com.google.cloud.Policy;
import com.google.cloud.Role;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.cloud.storage.StorageRoles;

public class AddBucketIamMember {
  /** Example of adding a member to the Bucket-level IAM */
  public static void addBucketIamMember(String projectId, String bucketName) {
    // The ID of your GCP project
    // String projectId = "your-project-id";

    // The ID of your GCS bucket
    // String bucketName = "your-unique-bucket-name";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
    Policy originalPolicy = storage.getIamPolicy(bucketName);

    // See the StorageRoles documentation for other valid roles:
    // https://googleapis.dev/java/google-cloud-clients/latest/com/google/cloud/storage/StorageRoles.html
    Role role = StorageRoles.objectViewer();

    // See the Identity documentation for other identities:
    // https://googleapis.dev/java/google-cloud-core/latest/com/google/cloud/Identity.html
    Identity identity = Identity.group("example@google.com");

    Policy updatedPolicy =
        storage.setIamPolicy(
            bucketName, originalPolicy.toBuilder().addIdentity(role, identity).build());

    if (updatedPolicy.getBindings().get(role).contains(identity)) {
      System.out.printf("Added %s with role %s to %s\n", identity, role, bucketName);
    }
  }
}
// [END storage_add_bucket_iam_member]
