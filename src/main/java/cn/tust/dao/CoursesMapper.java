package cn.tust.dao;

import cn.tust.model.Courses;
import cn.tust.model.CoursesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    long countByExample(CoursesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByExample(CoursesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByPrimaryKey(Integer cnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insert(Courses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insertSelective(Courses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    List<Courses> selectByExample(CoursesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    Courses selectByPrimaryKey(Integer cnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") Courses record, @Param("example") CoursesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExample(@Param("record") Courses record, @Param("example") CoursesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKeySelective(Courses record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courses
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKey(Courses record);
}