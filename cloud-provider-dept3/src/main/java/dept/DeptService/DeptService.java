package dept.DeptService;

import cn.dhx.api.entity.Dept;

import java.util.List;

public interface DeptService {
    void addDept(Dept dept);

    Dept findById(Integer id);

    List<Dept> findAll();
}
