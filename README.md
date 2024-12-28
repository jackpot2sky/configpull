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
  python -m venv venv
  source venv/bin/activate
  deactivate
  ```
- windows
  ```
  python -m venv venv
  Set-ExecutionPolicy Unrestricted -Scope Process
  .\venv\Scripts\activate
  deactivate
  ```
