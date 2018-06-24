package com.ibm.visresponse.app.dao;

//import java.util.List;

import javax.sql.DataSource;

import com.ibm.visresponse.app.VZResponse;

public interface VZResponseDAO {
	
  /** 
     * This is the method to be used to initialize
     * database resources ie. connection.
  */
  public void setDataSource(DataSource ds);
  
  /** 
    * This is the method to be used to create
    * a record in the Student table.
  */
  public void create(VZResponse vz);
  
  /** 
     * This is the method to be used to list down
     * all the records from the Student table.
  */
  //public List<VZResponse> listStudents(); 

}
