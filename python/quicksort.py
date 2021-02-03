# Quick sorts time complexity mostly comes out to be O(NlogN)
# Using random partition the time complexity can be reduced

def swap(arr, idx1, idx2):
	temp = arr[idx1]
	arr[idx1] = arr[idx2]
	arr[idx2] = temp

def partition(arr, start, end):
	# Choosing last element as pivot
	pivot = arr[end]
	partition_index = start
	
	for i in range(start,end):
		if arr[i] <= pivot:
			swap(arr,i,partition_index)
			partition_index = partition_index+1
	swap(arr,partition_index,end)
	return partition_index
		
def quick_sort(arr,start,end):
	if start<end:
		partition_idx = partition(arr,start,end)
		quick_sort(arr,start, partition_idx-1)
		quick_sort(arr,partition_idx+1,end)
	

arr = [6,1,7,3,6,9,0] # unsorted array
arr_length = len(arr) # array length

print(arr)

quick_sort(arr,0,arr_length-1)

print(arr)

			