- Office Deployment Tool
- Office Customization Tool
    - Office professional plus volume license
    - keep current settings
    - Export
# Install
- Create a folder, place the "Configuration.xml" and the Deployment Tool in the same folder, run the Deployment Tool as admin
- This will extract the files, run the setup with your "Configuration.xml"
- ```
  setup.exe /configure Configuration.xml
  ```

# Classic Context menu
- Enable
  ```
  reg.exe add "HKCU\Software\Classes\CLSID\{86ca1aa0-34aa-4e8b-a509-50c905bae2a2}\InprocServer32" /f /ve
  ```
- Undo
  ```
  reg.exe delete "HKCU\Software\Classes\CLSID\{86ca1aa0-34aa-4e8b-a509-50c905bae2a2}" /f
  ```
# choco install
```
Set-ExecutionPolicy Bypass -Scope Process
```
```
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
```
