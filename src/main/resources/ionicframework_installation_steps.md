ionicfreamework Installation steps
#Install the Ionic CLI
Before proceeding, make sure your computer has Node.js(https://nodejs.org/en/) installed. See these instructions(https://ionicframework.com/docs/installation/environment) to set up an environment for Ionic.
1. Download latest version of node.js from https://nodejs.org/en/download/current/

2. Download 
	Preferable: Windows Installer (.msi) 
		or Extract node-v13.11.0-win-x64.zip
			Open cmd(Command Prompt in Windows)
			Goto Extracted folder i.e., D:\Softwares\node-v13.11.0-win-x64
	
3. Set nodejs path in Windows to run **npm** commands.

  1. Goto Start -> Control Panel -> System -> Select 'Edit the system environment variables'.
  2. One popup window will open i.e., 'System Properties' -> click on Advanced tab -> Environment Variables.. -> 
  3. Another popup window 'Environment Variables' window will open -> At User Variables sections -> Check 'PATH' variable exist if yes select 'PATH' click on 'Edit'.
     1. Click on 'New' paste nodejs installed folder path **C:\Program Files\nodejs** or
     2. Click on Edit text -> Paste at the end **;C:\Program Files\nodejs**
  4. else 'New' -> At 'New User Variable' popup window -> Enter at '**Variable name**:' PATH and at '**Variable value**:' C:\Program Files\nodejs.
  5. Click Ok -> Click Ok -> Apply -> Ok.

4. ### [Installation Guide](https://ionicframework.com/getting-started]\)

   1. **Install Ionic**

      Install [Node.js](https://nodejs.org/en/), then install the latest **Ionic command-line tools** in your terminal. Follow the [Android](https://ionicframework.com/docs/developing/android) and [iOS](https://ionicframework.com/docs/developing/ios) platform guides to install their required tools.

      > npm install -g @ionic/cli

   2. **Start an app**

      Create an app using one of our ready-made app templates, or a blank one to start fresh. Check out the [Market](https://market.ionicframework.com) for more designs.

      #### Choose any one of example to start a project.

      ## [Examples](https://ionicframework.com/docs/cli/commands/start#examples)

      > ionic start
      >
      > ionic start --list
      >
      > ionic start myApp
      >
      > ionic start myApp blank
      >
      > ionic start myApp tabs --cordova
      >
      > ionic start myApp tabs --capacitor
      >
      > ionic start myApp super --type=ionic-angular
      >
      > ionic start myApp blank --type=ionic1
      >
      > ionic start cordovaApp tabs --cordova
      >
      > ionic start "My App" blankionic start "Conference App" https://github.com/ionic-team/ionic-conference-app

   3. Run your app

      Much of your app can be built in the browser with **ionic serve**. We suggest starting with this workflow. When you’re ready, check out our [Deploying](https://ionicframework.com/docs/deployment/app-store) guide.

      ```
      cd myApp
      ionic serve
      ```

5. Installing Cordova (https://cordova.apache.org/)
  Cordova command-line runs on Node.js and is available on NPM. Open a command prompt or Terminal, and type `npm install -g cordova`.
  4.Node is bundled with npm, the package manager for JavaScript.

  To verify the installation, open a new terminal window and run:

  `node --version`
  `npm --version`

6. Git Installation
  Although not required, the version control system Git is highly recommended.

  Git is often accompanied by a Git Host, such as GitHub, in which case additional setup is required. Follow the tutorial from the Git Host's documentation to set up Git:

  Follow below one procedure

  - GitHub: Set up Git(https://help.github.com/en/articles/set-up-git)
  - GitLab: Installing Git(https://docs.gitlab.com/ee/topics/git/how_to_install_git)
  - Bitbucket: Install Git(https://www.atlassian.com/git/tutorials/install-git)

  Otherwise, follow the official installation instructions(https://git-scm.com/book/en/v2/Getting-Started-Installing-Git). The command-line utility can be downloaded from the download page(https://git-scm.com/downloads).

  If you want to work with Git locally, but don't want to use the command line, you can instead download and install the GitHub Desktop client(https://desktop.github.com/). For more information, see "Getting started with GitHub Desktop."(https://help.github.com/en/desktop/guides/getting-started-with-github-desktop)

  To verify the installation, open a new terminal window and run:

  `git --version`

7. Install the Ionic CLI with npm:

  * `npm install -g @ionic/cli`

  * Do you want to install the latest ionicframework using CLI use below command.

    `npm install -g @ionic/cli@latest`

  * in above command `-g` is global

8. If there was a previous installation of the Ionic CLI, it will need to be uninstalled due to a change in package name.

  `npm uninstall -g ionic`
  `npm install -g @ionic/cli`


The -g option means install globally. When packages are installed globally, EACCES permission errors can occur. Consider setting up npm to operate globally without elevated permissions. See Resolving Permission Errors(https://ionicframework.com/docs/faq/tips#resolving-permission-errors) for more information.

8. To workon ionicframework download IDE Visual Studio Code(https://code.visualstudio.com/docs/?dv=win)

9. set npm path in Environment Variables in Windows
	1. Win button -> type "Edit the system environment variables" -> click on Advanced tab -> Select Environment Variables button
	2. At System variables window -> click on New button -> click on Ok to save the settings.
	

