# Install CUPS
```bash
sudo pacman -S cups
```
If you have a USB printer, you may also want:
```bash
sudo pacman -S usbutils
```
For printer drivers, you can install:
```bash
sudo pacman -S gutenprint
```

# Enable and start CUPS
```bash
sudo systemctl enable --now cups.service
```
Check whether it is running:
```bash
systemctl status cups
```

# Open the CUPS web interface
- http://127.0.0.1:631
- https://localhost:631 (if HTTPS is configured)
- Go to `Administration` --> `Add Printer`

I have epson l3110. should I select 9 pin or 24 pin?

Neither 9-pin nor 24-pin. The Epson L3110 is an inkjet printer, not a dot-matrix printer.

Clean the print head by pressing and holding the upside-down-triangle-contained-circle button (third button after the power button) for 5 seconds. Power button light starts flashing. Wait until the flashing stops.

If your Epson L3110 uses ESC/P-R (not the 9-pin or 24-pin dot-matrix protocol):

Install the correct driver:
```bash
yay -S epson-inkjet-printer-escpr
```

Install Epson Printer Utility:
```bash
yay -S epson-printer-utility
```

Restart CUPS:
```bash
sudo systemctl restart cups
```

Open `http://localhost:631` --> Administration --> Delete the printer you added with the 9-pin/24-pin driver --> Add Printer again and select the inkjet option now.

To clean the print head, open terminal and run:
```bash
epson-printer-utility
```

If you get this error:
```shell
[Abhiram@myarch ~]$ epson-printer-utility
Communication daemon down, Error code = -1
[Abhiram@myarch ~]$
```

Start the Epson communication service:
```bash
sudo systemctl enable --now ecbd.service
```

Check whether it's running:
```bash
systemctl status ecbd.service
```
You should see:
`Active: active (running)`

Launch Epson Utility again:
```bash
epson-printer-utility
```


Clean the print head - perform a nozzle check first to decide if a print head cleaning is required.
