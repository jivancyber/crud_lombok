package com.crud_final.crud_op;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class CrudOpApplication {

	@Autowired
	private CrudController crudController;

	public static void main(String[] args) {
		SpringApplication.run(CrudOpApplication.class, args);
	}


	@RequestMapping("/info")
	public List<CrudData> getAllInfo(){
		return crudController.getAllInfo();
	}
	@RequestMapping("/info/{id}")
	public CrudData getData(@PathVariable int id){
		return crudController.getData(id);


	}
	@RequestMapping(method = RequestMethod.POST,value ="/info/add" )
    public void addData(@RequestBody CrudData new_data){
	    crudController.addData(new_data);

    }

	@RequestMapping(method = RequestMethod.PUT,value ="/info/{id}" )
	public void updateData(@RequestBody CrudData new_data,@PathVariable int id){
		crudController.updateData(id,new_data);

	}
	@RequestMapping(method = RequestMethod.DELETE,value ="/info/{id}")
	public void deleteData(@PathVariable int id){
		crudController.deleteData(id);
	}

}
