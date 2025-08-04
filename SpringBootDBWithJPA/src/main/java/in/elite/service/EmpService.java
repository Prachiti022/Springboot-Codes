package in.elite.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.elite.dao.EmpRepository;
import in.elite.entity.Emp;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public EmpService(EmpRepository empRepository) {

    	this.empRepository = empRepository;
    }

    // get all emp
    public List<Emp> getAllEmp() {
        return (List<Emp>) this.empRepository.findAll();
    }

    // get emp by id
    public Emp getEmpById(int id) {
        Emp emp = null;
        try {
            emp = this.empRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    // adding new emp
    public Emp addEmp(Emp emp) {
        return empRepository.save(emp);
    }

    // update emp
    public void updateEmp(Emp emp, int empId) {
        emp.setId(empId);
        empRepository.save(emp);
    }

    // delete emp
    public void deleteEmp(int empId) {
        empRepository.deleteById(empId);
    }
}
