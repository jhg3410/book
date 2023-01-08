package 함수.switch문.good

import 함수.switch문.good.employee.EmployeeRecord

fun main() {

    val factory: EmployeeFactory = EmployeeFactoryImpl()
    val employee = factory.makeEmployee(EmployeeRecord.COMMISSIONED)

    employee.calculatePay()
}