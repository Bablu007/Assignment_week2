
public class Department {
    int id;
    String d_name,d_head, d_unitno;
    /*
    public Department(int id, String d_name,String d_head, String d_unitno)
    {
        this.id = id;
        this.d_name = d_name;
        this.d_head = d_head;
        this.d_unitno = d_unitno;
    }*/
    
    public String showd()
    {
        return "Departmen::"+id+" "+d_name+" "+d_head+" "+d_unitno;
    }

	
	public void setId(int id) {
		this.id = id;
	}

	

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_head() {
		return d_head;
	}

	public void setD_head(String d_head) {
		this.d_head = d_head;
	}

	

	public void setD_unitno(String d_unitno) {
		this.d_unitno = d_unitno;
	}
    
    
}
