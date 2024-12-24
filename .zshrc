export PATH="/usr/local/bin/python3.12:$PATH"
alias python=python3.12
export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion
eval "$(/opt/homebrew/bin/brew shellenv)"
export PATH="/usr/local/opt/postgresql@14/bin:$PATH"
export PATH="/opt/homebrew/opt/postgresql@14/bin:$PATH"
export PATH="/opt/homebrew/Cellar/postgresql@17/17.0_3/bin:$PATH"
export PATH="/opt/homebrew/Cellar/postgresql@17/17.0_3/bin:$PATH"

# Added by Windsurf
export PATH="/Users/julio/.codeium/windsurf/bin:$PATH"
export JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
