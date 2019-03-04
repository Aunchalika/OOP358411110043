package lab10;

public class DAOApp {

    public static void main(String[] args) {

        empDAOImpl dao = empDAOImpl.getInstant();
        //GET_ALL_EMP
        showAllData(dao);
        //ADD_EMP
        Employee newEmp = new Employee(
                102,
                "Jinraporn Thomkeaw",
                "System Analysis",
                3000);
//       dao.addEmp(newEmp);
//        showAllData(dao);

        //FIND_BY_ID
        Employee e = dao.getEmpById(100);
        System.out.println(e.toString());

        //UPDATE_EMP
        e.setSalary(30000);
        dao.updateEmp(e);
        showAllData(dao);

        //DELETE_EMP
        dao.deleteEmp(100);
        showAllData(dao);
    }

    private static void showAllData(empDAOImpl dao) {
        List<Employee> allEmp = dao.getAllEmp();
        System.out.println("-----Data in Database-----");
        for (Employee emp : allEmp) {
            System.out.println(emp.toString());
        }
        System.out.println("--------------------------");
    }
}

