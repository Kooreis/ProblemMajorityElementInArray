majority_count = len(arr) // 2
    for num, count in count_dict.items():
        if count > majority_count:
            return num
    return None