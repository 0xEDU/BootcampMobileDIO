import os

# Inputs
files = input("Which files do you want to add?(Press enter for *): ")
msg = input("Write your commit message: ")

# Add file
if files != "":
	os.system(f"git add {files}")
else:
	os.system("git add *")

# Commit
os.system(f'git commit -m "{msg}"')

# Push
push_git = input("Do you want to push?(y/n) ")

while True:
	if push_git == "y" or push_git == "yes":
		os.system("git push origin master")
		exit()
	elif push_git == "n" or push_git == "no":
		exit()
	else:
		continue
	
