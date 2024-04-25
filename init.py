
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def print_list(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

# Create a linked list with dummy string values
llist = LinkedList()
llist.append("Apple")
llist.append("Banana")
llist.append("Cherry")
llist.append("Date")

# Print the linked list
llist.print_list()
