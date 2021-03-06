package cn.tust.dao;

import cn.tust.model.Students;
import cn.tust.model.StudentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    long countByExample(StudentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByExample(StudentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByPrimaryKey(Integer snumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insert(Students record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insertSelective(Students record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    List<Students> selectByExample(StudentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    Students selectByPrimaryKey(Integer snumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") Students record, @Param("example") StudentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExample(@Param("record") Students record, @Param("example") StudentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKeySelective(Students record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKey(Students record);
}