import cn.dhx.api.entity.Dept;
import cn.dhx.dept.Application8081;
import cn.dhx.dept.mapper.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application8081.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext
public class DeptMapperTest {
    @Autowired
    private DeptMapper deptMapper;
    @Test
    public void addDeptTest(){
        Dept dept = new Dept(null,"软件部","dept");
        deptMapper.addDept(dept);
        System.out.println(deptMapper.findAll());

    }
}
