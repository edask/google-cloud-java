// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1/cloudscheduler.proto

package com.google.cloud.scheduler.v1;

public interface UpdateJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1.UpdateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The new job properties. [name][google.cloud.scheduler.v1.Job.name] must be specified.
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * Required. The new job properties. [name][google.cloud.scheduler.v1.Job.name] must be specified.
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.scheduler.v1.Job getJob();
  /**
   *
   *
   * <pre>
   * Required. The new job properties. [name][google.cloud.scheduler.v1.Job.name] must be specified.
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.scheduler.v1.JobOrBuilder getJobOrBuilder();

  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
