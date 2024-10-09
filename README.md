This code is a result of the following maintenance plan for the code located: https://github.com/Coding4Clazz/module4


Maintenance Task: Adapt LinkedList to Stack  - Summary of Plan & Changes
Objective:

Modify the program from Module4, which reads integers into a linked list and sorts them before eventually providing the output as a sorted list.  The new version now uses a stack without sacrificing previous sorting functionality.

Approach:

	⁃	Replace LinkedList with Stack using the Java Collections Framework (Stack<Integer>).
	⁃	Ensure that the program still sorts the input in ascending order before printing
	⁃	Maintain the overall program logic without rewriting the code from scratch

Plan:

	Replace LinkedList with Stack:

	⁃	Modify the declaration from LinkedList<Integer> to Stack<Integer>

	Slight revision to sorting logic:

	⁃	The stack operates in a LIFO (Last-In-First-Out) manner. To maintain sorted order, input will still be sorted before being pushed into the stack
	⁃	After sorting, push each element onto the stack.

	Maintain previous program flow, specifically:

	⁃	Keep the scanning process as is
	⁃	Once the input is gathered, sort it, and push the elements onto the stack in sorted order.

	Code adjustments

	⁃	Minor to make program stack based vs list based (updated code in file)

Changes:
Use of Stack:
	⁃	The Stack<Integer> is used in place of the LinkedList<Integer>.
	⁃	A temporary list (ArrayList<Integer>) is used to collect inputs and sort them before pushing onto the stack.

Sorting:
	⁃	The sorting happens in the tempList, and after sorting, the numbers are pushed onto the stack in the sorted order.

Stack Operations:
	⁃	The stack's LIFO nature is maintained, but since the sorted numbers are pushed onto the stack in order, the output will still show a sorted collection.

This code contains many examples of code reuse, which are similar to those highlighted in the previous weeks assigments.  These examples include:

	⁃	The use of the scanner for input handling consistently as an object vs. creating new instances
	⁃	Temporary list for input storage (same temp list is used to store all integer inputs, sort them, and is then pushed into Stack)
	⁃	Use of Methods from the Java Collections Framework (Sort Method for example)
	⁃	Loop for validation/addition of elements (implicitly reusing code)
