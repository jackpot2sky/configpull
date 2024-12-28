# [gnome] isolate workspaces
- ```
  gsettings set org.gnome.shell.app-switcher current-workspace-only true
  ```
- ```
  gsettings set org.gnome.shell.extensions.dash-to-dock isolate-workspaces true
  ```

# python venv
- linux
  ```
  python -m venv env
  source env/bin/activate
  deactivate
  ```
- windows
  ```
  python -m venv env
  Set-ExecutionPolicy Unrestricted -Scope Process
  .\env\Scripts\activate
  deactivate
  ```
