import json

# JSON string
employee = '{"id":"09", "name": "Nitin", "department":"Finance"}'

# Convert string to Python dict
employee_dict = json.loads(employee)
print(employee_dict)
print(type(employee_dict))
print("\n")

# Convert Python dict to JSON
json_object = json.dumps(employee_dict, indent=4)
print(json_object)
print(type(json_object))
