package cn.tust.model;

public class Classrooms {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classrooms.rNumber
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    private Integer rnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classrooms.rCount
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    private Integer rcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classrooms.rMultiMedia
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    private Byte rmultimedia;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Classrooms(Integer rnumber, Integer rcount, Byte rmultimedia) {
        this.rnumber = rnumber;
        this.rcount = rcount;
        this.rmultimedia = rmultimedia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Classrooms() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classrooms.rNumber
     *
     * @return the value of classrooms.rNumber
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Integer getRnumber() {
        return rnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classrooms.rNumber
     *
     * @param rnumber the value for classrooms.rNumber
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setRnumber(Integer rnumber) {
        this.rnumber = rnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classrooms.rCount
     *
     * @return the value of classrooms.rCount
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Integer getRcount() {
        return rcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classrooms.rCount
     *
     * @param rcount the value for classrooms.rCount
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setRcount(Integer rcount) {
        this.rcount = rcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classrooms.rMultiMedia
     *
     * @return the value of classrooms.rMultiMedia
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Byte getRmultimedia() {
        return rmultimedia;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classrooms.rMultiMedia
     *
     * @param rmultimedia the value for classrooms.rMultiMedia
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setRmultimedia(Byte rmultimedia) {
        this.rmultimedia = rmultimedia;
    }
}