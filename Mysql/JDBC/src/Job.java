public class Job {

  private int id;
  private String job;
  private  String des;

  public Job(int id, String job, String des) {
    this.id = id;
    this.job = job;
    this.des = des;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
  }

  @Override
  public String toString() {
    return "Job{" +
        "id£º" + id +
        ", job£º'" + job + '\'' +
        ", des£º'" + des + '\'' +
        '}';
  }
}
