package in.elite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.elite.entity.Emp;
import in.elite.service.EmpService;

@RestController
@RequestMapping("/api/Emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/emp")
	public List<Emp> getEmp() {
		return this.empService.getAllEmp();
	}
	
	@GetMapping("/emp/{id}")
	public Emp getEmp(@PathVariable("id") int id) {
		return empService.getEmpById(id);
	}
	
	@PostMapping("/emp")
	public Emp addEmp(@RequestBody Emp emp) {
		this.empService.addEmp(emp);
		return emp;
	}
	
	@DeleteMapping("/emp/{empId}")
	public void deleteEmp(@PathVariable("empId") int empId) {
		this.empService.deleteEmp(empId);
	}
	
	@PutMapping("/emp/{empId}")
	public Emp updateEmp(@RequestBody Emp emp, @PathVariable("empid") int empid) {
		this.empService.updateEmp(emp, empid);
		return emp;
	}
	
//	@GetMapping("/getemp")
//	public Emp getEmp() {
//		Emp emp = new Emp(0, null, null);
//		emp.setId(1234);
//		emp.setEmpName("Prachiti");
//		emp.setDeptName("IT");
//		return emp;
//	}
}