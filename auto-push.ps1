$projectPath = "C:\Users\rutik\Desktop\DS"

Set-Location $projectPath

Write-Host "================================="
Write-Host " GitHub Auto Push Started"
Write-Host " Project: $projectPath"
Write-Host " Checking every 5 minutes..."
Write-Host "================================="

while ($true) {

    $status = git status --porcelain

    if ($status) {

        Write-Host ""
        Write-Host "Changes detected!" -ForegroundColor Yellow

        git add .

        $time = Get-Date -Format "yyyy-MM-dd HH:mm:ss"

        git commit -m "Auto commit: $time"

        git push origin main

        Write-Host "Code pushed successfully!" -ForegroundColor Green
    }
    else {

        Write-Host ""
        Write-Host "No changes found." -ForegroundColor Cyan
    }

    Write-Host "Next check in 5 minutes..."
    Start-Sleep -Seconds 300
}