
# Bubble sort has the time complexity for O(n^2) (Big O of n squared)
# because the entire array needs to be iterated for every element
def bubble_sort(arr, length):
	loop_till = length-1
	for i in range(0,loop_till):
		#Whenever the inner loop completes the last element in arary is sorted
		#So, everytime the outer loop (i) increments then inner loop (j) is decreases by i
		for j in range(0,loop_till-i):
			if arr[j]>arr[j+1] :
				temp = arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = temp
				
arr = [6,1,7,3,6,9,0] # unsorted array
arr_length = len(arr) # array length

print(arr)

bubble_sort(arr,arr_length)

print(arr)




