package cn.dhx.dept.DeptService.impl;

import cn.dhx.api.entity.Dept;
import cn.dhx.dept.DeptService.DeptService;
import cn.dhx.dept.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public void addDept(Dept dept) {
        deptMapper.addDept(dept);
    }

    @Override
    public Dept findById(Integer id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
