package cn.tust.dao;

import cn.tust.model.Timetable;
import cn.tust.model.TimetableExample;
import cn.tust.model.TimetableKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimetableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    long countByExample(TimetableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByExample(TimetableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByPrimaryKey(TimetableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insert(Timetable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insertSelective(Timetable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    List<Timetable> selectByExample(TimetableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    Timetable selectByPrimaryKey(TimetableKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") Timetable record, @Param("example") TimetableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExample(@Param("record") Timetable record, @Param("example") TimetableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKeySelective(Timetable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKey(Timetable record);
}