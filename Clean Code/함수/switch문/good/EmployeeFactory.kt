package 함수.switch문.good

import 함수.switch문.good.employee.*

interface EmployeeFactory {
    fun makeEmployee(r: EmployeeRecord): Employee
}

class EmployeeFactoryImpl: EmployeeFactory {
    override fun makeEmployee(r: EmployeeRecord): Employee {
        when(r) {
            EmployeeRecord.COMMISSIONED -> return CommissionedEmployee()
            EmployeeRecord.HOURLY -> return HourlyEmployee()
            EmployeeRecord.SALARIED -> return SalariedEmployee()
        }
    }
}