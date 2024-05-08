# [Linux] Isolate workspaces
- ```
  gsettings set org.gnome.shell.app-switcher current-workspace-only true
  ```
- ```
  gsettings set org.gnome.shell.extensions.dash-to-dock isolate-workspaces true
  ```

# Python venv
- linux
- ```
  python -m venv myenv
  source myenv/bin/activate
  deactivate
  ```
- windows
- ```
  python -m venv myenv
  Set-ExecutionPolicy Unrestricted -Scope Process
  .\myenv\Scripts\activate
  deactivate
  ```
