package cn.tust.dao;

import cn.tust.model.Classrooms;
import cn.tust.model.ClassroomsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassroomsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    long countByExample(ClassroomsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByExample(ClassroomsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int deleteByPrimaryKey(Integer rnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insert(Classrooms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int insertSelective(Classrooms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    List<Classrooms> selectByExample(ClassroomsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    Classrooms selectByPrimaryKey(Integer rnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") Classrooms record, @Param("example") ClassroomsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByExample(@Param("record") Classrooms record, @Param("example") ClassroomsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKeySelective(Classrooms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classrooms
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    int updateByPrimaryKey(Classrooms record);
}