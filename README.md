# fsl-community-bsp-jethro-customization

Author: purvi.billore@gmail.com

Note: For customizing using the jethro branch of same repo for build......

Repository for fsl-community-bsp-jethro-customization, for customized board.

FSL Community BSP

To get the BSP you need to have repo installed if not installed follow the below command:

Install the repo utility:

$: mkdir ~/bin $: curl http://commondatastorage.googleapis.com/git-repo-downloads/repo > ~/bin/repo $: chmod a+x ~/bin/repo

Download the BSP source:

$: PATH=${PATH}:~/bin $: mkdir fsl-community-bsp-baseband $: cd fsl-community-bsp-baseband $: repo init -u https://github.com/purvibillore/fsl-community-bsp-jethro-customization.git -b master $: repo sync

At the end of the commands you have every sources you need to start work with.

To start a simple image build:

Read README file in same directory as this README.md file.

You can use any directory to host your build.

The source code is checked out at fsl-community-bsp-jethro-customization/sources.
