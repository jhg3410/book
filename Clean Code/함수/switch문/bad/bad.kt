package 함수.switch문.bad


/*
* 이와 같으면 아래같은 함수가 추가될 때마다 when(switch) 문이 필요하다.
* HOURLY 의 기능만 변경돼도 모든 직원 유형에 영향이 가는 함수를 변경해야한다.
* 새 직원 유형이 들어오면 해당 함수를 변경해야한다.
*/

enum class Employee {
    COMMISSIONED, HOURLY, SALARIED
}

fun calculatePay(employee: Employee): Int {
    when (employee) {
        Employee.COMMISSIONED -> {
            return 1
        }

        Employee.HOURLY -> {
            return 1
        }

        Employee.SALARIED -> {
            return 1
        }
    }
}

fun main() {
    calculatePay(Employee.SALARIED)
}