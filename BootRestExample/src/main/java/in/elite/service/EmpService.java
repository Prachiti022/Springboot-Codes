package in.elite.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import in.elite.entity.Emp;

@Component
public class EmpService {
	public static List<Emp> list = new ArrayList<>();
	
	static {
		list.add(new Emp(185, "Prachiti", "CO"));
		list.add(new Emp(156, "Uma", "IT"));
	}
	
	public List<Emp> getAllEmp(){
		return list;
	}
	
	public Emp getEmpById(int id) {
		Emp emp = null;
		emp = list.stream().filter(e->e.getId()==id).findFirst().get();
		return emp;
	}

	public void addEmp(Emp e) {
		list.add(e);
	}

	public void deleteEmp(int eid) {
		list = list.stream().filter(emp->emp.getId()!=eid).collect(Collectors.toList());
		
	}

	public void updateEmp(Emp emp, int eId) {
		list = list.stream().map(e->{
			if(e.getId()==eId) {
				e.setEmpName(emp.getEmpName());
				e.setDeptName(emp.getDeptName());
			}
			return e;
		}).collect(Collectors.toList());
		
	}
}