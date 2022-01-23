# JavaEE_WebApp
#### This is a sample project to practice CRUD operations of Java EE Web App.

## How to push an Eclipse project to GitHub

### Setting up the repo and cloning
1. Create a GitHub repo and copy the HTTP link.
2. In Eclipse click on "Open Perspective" (The icon next to search icon) and select Git.
3. Select the option "Clone a Git repository..."
4. Paste the URL in the given space and click Next. Click next again
5. In the final window we can change the Destination Directory to a desiered one (I created a separate folder in D:/ named Git repository)

### Adding the project to Git repo
#### We can use an exsisting project or create a new one 

Do the following

1. Right click on the created/exsisting project 
2. Team > Share Project 
3. Select the cloned repository as the Repository , click Finish

if the project is already added 
when u select Team more options (Commit, push etc.) will be visible.

### Making a commit

1. Right click on project >  Team > Commit 
2. Select all unstaged changes and add them to staged changes
3. Add a meaningful commit message
4. Click "Commit and Push"
5. Next > Enter user name and password > Finish > Previous step > OK

### Password error (Very commen) -> Create a access token

1. Go to settings by clicking the drop down beside your icon in GitHub
2. Developer settings > Personal access token > Generate new token
3. Type a name > set the expiration to 90 days > select repo > Create
4. Copy the token
5. Eveytime Eclipse asks for password use the access token

### Making the parent folder(project folder) as the local repository

1. Right click on project >  Team > Share Project
2. Check the dialoge box "Use or create repository in..."
3. Select the project
4. Click "Create Repository" > Finish


