package cn.dhx.dept.mapper;


import cn.dhx.api.entity.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Insert("insert into dept(deptNo,dName,dbSource) value(#{deptNo},#{dName},#{dbSource})")
    public void addDept(Dept dept);

    @Select("select deptNo,dName,dbSource from dept where deptNo = #{id}")
    public Dept findById(Integer id);

    @Select("select * from dept")
    public List<Dept> findAll();
}
