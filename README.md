# HelloWorld2

This is the README file for the second repository created during Lab1.

- [x] Follow/Perform the steps in the [Github HelloWorld Guide](https://guides.github.com/activities/hello-world/)
- [x] Create SSH key and link it to GitHub
- [x] Create a HelloWorld2 repository
- [x] Create a HelloWorld java program

If already running Git with a different user:

1. Create a new directory for the repository: ```mkdir <repository_name>```
1. Navigate to the new directory: ```cd <repository_name>```
1. Initialize Git version control: ```git init```
1. Update the user email (if needed): ```git config user.email "email@domain"```
1. Create an SSH command to the local Git config file: ```git config core.sshCommand "ssh -i <path to SSH key>"``` ([Reference](https://medium.com/@pinglinh/how-to-have-2-github-accounts-on-one-machine-windows-69b5b4c5b14e))
1. Start the SSH agent (on Git Bash): ```eval "$(ssh-agent -s)"```
1. Add the SSH key to SSH agent (on Git Bash): ```ssh-add <path to SSH key>```

It will be painful to do this to every repository...
