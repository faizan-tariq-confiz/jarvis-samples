
# Install required libraries using the bash script 'install_libraries.sh'

# Python code to plot a graph
import matplotlib.pyplot as plt

# Data for plotting
x = [1, 2, 3, 4, 5]
y = [2, 3, 5, 7, 11]

# Plotting the graph
plt.plot(x, y)
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.title('Sample Graph')
plt.grid(True)
plt.show()
