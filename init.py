
class Employee:
    def __init__(self, employee_id, employee_name, employee_type):
        self.employee_id = employee_id
        self.employee_name = employee_name
        self.employee_type = employee_type
        self.next = None

class EmployeeLinkedList:
    def __init__(self):
        self.head = None

    def insert_employee(self, employee):
        new_node = Employee(employee.employee_id, employee.employee_name, employee.employee_type)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def display_employees(self):
        current = self.head
        while current:
            print(current.employee_id, current.employee_name, current.employee_type)
            current = current.next

# Create linked list and populate with employee data
emp_list = EmployeeLinkedList()

# Populate with data
emp_list.insert_employee(Employee(1, 'Jarvis', 'AI Agent'))
emp_list.insert_employee(Employee(2, 'Friday', 'AI Agent'))
emp_list.insert_employee(Employee(3, 'Faizan', 'Regular'))

# Display employees in the linked list
emp_list.display_employees()
