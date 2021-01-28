
#Selection sort has the time complexity for O(n^2) (Big O of n squared)
def selection_sort(arr, arr_len):
	for i in range(0,arr_len-1):
		minimum = i #Assuming minimum value index to be id
		for j in range(i+1,arr_len):
			if arr[j]< arr[minimum] :
				minimum = j
		#Swapping elements
		temp = arr[i]
		arr[i] = arr[minimum]
		arr[minimum] = temp
		

arr = [6,1,7,3,6,9,0] # unsorted array
arr_length = len(arr) # array length

print(arr)

selection_sort(arr,arr_length)

print(arr)
