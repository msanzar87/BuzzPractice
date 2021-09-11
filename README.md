#Practice

---
###Clone project to your computer:

- Navigate to a folder in your terminal that you would like to store the file and enter. 
  
  - git clone https://github.com/MBuzzard87/practice.git


###Create a repo within on your own GitHub:

- Navigate to your GitHub home page, click on "Repositories" then click "New".  
- Name the repo, DO NOT add a readme, gitinore, or license. Click create "Repository" 


###Add the project to your GitHub

- After cloning the project to your local computer and navigating to the location of your 
  project within the terminal enter.
  
  - git remote -v


- It should print:

  - origin  https://github.com/MBuzzard87/practice.git (fetch)
  - origin  https://github.com/MBuzzard87/practice.git (push)
    

- That is the current remote location for the project. We are going to detach your 
  local project from the remote location above and add it to your own repo. 
  

- Navigate to the file location on your terminal and enter.
  - git remote set-url origin "enter location of repo here"
    
Example: git remote set-url origin https://github.com/username/new_repo

- Then enter git remote -v. The location should be updated to your remote repo.


- Now you want to push your project.
  - git add .
  - git commit -m "inital commit"
  - git push  



#Work in your dev branch!!!

---

- Enter "git branch" in your terminal to view the current branch you're working in:


- If you're in main then navigate to dev by entering "git checkout dev"
  - As you complete work you want to commit and push as often as possible (I add/commit/push after completing a method or a class,
    think about the person reviewing your code. If they have 900+ lines of code to look through it makes their job difficult, pushing often allows
    them to view the code broken down to decide if it won't affect the rest of the program).
    - git add .
    - git commit -m "enter what you completed"
    - git push
    

- This will update your local and remote dev branch. If you would like to update your main branch then navigate to the main branch by entering "git checkout main".
 Enter "git branch" to make sure you are in the main branch. In order to update your local main branch to where your
  dev branch is enter "git merge dev" into the terminal. From there you only need to enter "git push" in your terminal to update your remote main branch.
  After updating your main branch you want to navigate back to your dev by entering "git checkout dev" in your terminal
  where you will continue to work, repeating the process over again when you make progress.
  

  
    