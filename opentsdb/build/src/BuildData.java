/* This file was generated by ../build-aux/gen_build_data.sh.  Do not edit manually.  */
package net.opentsdb;

/** Build data for {@code net.opentsdb} */
public final class BuildData {
  /** Version string MAJOR.MINOR.MAINT */
  public static final String version = "2.0.0";
  /** Short revision at which this package was built. */
  public static final String short_revision = "";
  /** Full revision at which this package was built. */
  public static final String full_revision = "";
  /** UTC date at which this package was built. */
  public static final String date = "2013/11/21 02:43:54 +0000";
  /** UNIX timestamp of the time of the build. */
  public static final long timestamp = 1385001834;

  /** Represents the status of the repository at the time of the build. */
  public static enum RepoStatus {
    /** The status of the repository was unknown at the time of the build. */
    UNKNOWN,
    /** There was no local modification during the build. */
    MINT,
    /** There were some local modifications during the build. */
    MODIFIED;
  }
  /** Status of the repository at the time of the build. */
  public static final RepoStatus repo_status = RepoStatus.MODIFIED;

  /** Username of the user who built this package. */
  public static final String user = "ysidhhu";
  /** Host on which this package was built. */
  public static final String host = "ymshbase-02.ops.bf1.yahoo.com";
  /** Path to the repository in which this package was built. */
  public static final String repo = "/grid/0/tmp/opentsdb2_rb/opentsdb/build";

  /** Human readable string describing the revision of this package. */
  public static final String revisionString() {
    return "net.opentsdb 2.0.0 built at revision  (MODIFIED)";
  }
  /** Human readable string describing the build information of this package. */
  public static final String buildString() {
    return "Built on 2013/11/21 02:43:54 +0000 by ysidhhu@ymshbase-02.ops.bf1.yahoo.com:/grid/0/tmp/opentsdb2_rb/opentsdb/build";
  }

  // These functions are useful to avoid cross-jar inlining.

  /** Version string MAJOR.MINOR.MAINT */
  public static String version() {
    return version;
  }
  /** Short revision at which this package was built. */
  public static String shortRevision() {
    return short_revision;
  }
  /** Full revision at which this package was built. */
  public static String fullRevision() {
    return full_revision;
  }
  /** UTC date at which this package was built. */
  public static String date() {
    return date;
  }
  /** UNIX timestamp of the time of the build. */
  public static long timestamp() {
    return timestamp;
  }
  /** Status of the repository at the time of the build. */
  public static RepoStatus repoStatus() {
    return repo_status;
  }
  /** Username of the user who built this package. */
  public static String user() {
    return user;
  }
  /** Host on which this package was built. */
  public static String host() {
    return host;
  }
  /** Path to the repository in which this package was built. */
  public static String repo() {
    return repo;
  }

  // Can't instantiate.
  private BuildData() {}
}