package com.crud_final.crud_op;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CrudController {

    private List<CrudData> data= new ArrayList<>(Arrays.asList(
            new CrudData(02,"Manu","8800123456","new Delhi"),
            new CrudData(01,"Gourav","8130123456","Noida"),
            new CrudData(03,"Divyanshu","1234567890","New Delhi"),
            new CrudData(04,"Ajay","1234567890","Gurugaon")
    ));

    public List<CrudData> getAllInfo(){
        return data;
    }

    public CrudData getData(int id){
        return data.stream().filter(t ->t.getId()==id).findFirst().get();
    }

    public void addData(CrudData new_data){
        data.add(new_data);}

    public void updateData(int id, CrudData new_data){
        for (int i=0;i<data.size();i++){
            CrudData t=data.get(i);
            if(t.getId()==id){
                data.set(i,new_data);
                return;
            }
        }

    }
    public void deleteData(int id){
        data.removeIf(t -> t.getId()==id);

    }

}

