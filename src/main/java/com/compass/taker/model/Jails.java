package com.compass.taker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)

@Data
@Document(collection = "Jails")
public class Jails {

    @Id
    private Integer CONFIG_VERSION;
    private Integer allow_chflag;
    private Integer allow_mlock;
    private Integer allow_mount;
    private Integer allow_mount_devfs;
    private Integer allow_mount_fusefs;
    private Integer allow_mount_nullf;
    private Integer allow_mount_procfs;
    private Integer allow_mount_tmpfs;
    private Integer allow_mount_zfs;
    private Integer allow_quotas;
    private Integer allow_raw_sockets;
    private Integer allow_set_hostname;
    private Integer allow_socket_af;
    private Integer allow_sysvipc;
    private Integer allow_tun;
    private Integer allow_vmm;
    private Integer assign_localhost;
    private String available;
    private Integer basejail;
    private Integer boot;
    private Integer bpf;
    private String children_max;
    private String cloned_release;
    private String comment;
    private String compression;
    private String compressratio;
    private String coredumpsize;
    private String count;
    private String cpuset;
    private String cputime;
    private String datasize;
    private String dedup;
    private String defaultrouter;
    private String defaultrouter6;
    private String depends;
    private String devfs_ruleset;
    private Integer dhcp;
    private String enforce_statfs;
    private Integer exec_clean;
    private String exec_created;
    private String exec_fib;
    private String exec_jail_user;
    private String exec_poststart;
    private String exec_poststop;
    private String exec_prestart;
    private String exec_prestop;
    private String exec_start;
    private String exec_stop;
    private String exec_system_jail_user;
    private String exec_system_user;
    private String exec_timeout;
    private String host_domainname;
    private String host_hostname;
    private String host_hostuuid;
    private Integer host_time;
    private String hostid;
    private Integer hostid_strict_check;
    private String interfaces;
    private String ip4;
    private String ip4_addr;
    private Integer ip4_saddrsel;
    private String ip6;
    private String ip6_addr;
    private Integer ip6_saddrsel;
    private Integer ip_hostname;
    private Integer jail_zfs;
    private String jail_zfs_dataset;
    private String jail_zfs_mountpoint;
    private String last_started;
    private String localhost_ip;
    private String login_flags;
    private String mac_prefix;
    private String maxproc;
    private String memorylocked;
    private String memoryuse;
    private Integer mount_devfs;
    private Integer mount_fdescfs;
    private Integer mount_linprocfs;
    private Integer mount_procfs;
    private String mountpoint;
    private String msgqqueued;
    private String msgqsize;
    private Integer nat;
    private String nat_backend;
    private String nat_forwards;
    private String nat_interface;
    private String nat_prefix;
    private String nmsgq;
    private String notes;
    private String nsem;
    private String nsemop;
    private String nshm;
    private String nthr;
    private String openfiles;
    private String origin;
    private String owner;
    private String pcpu;
    private String plugin_name;
    private String plugin_repository;
    private String priority;
    private String pseudoterminals;
    private String quota;
    private String readbps;
    private String readiops;
    private String release;
    private String reservation;
    private String resolver;
    private String rlimits;
    private Integer rtsold;
    private String securelevel;
    private String shmsize;
    private String stacksize;
    private String state;
    private String stop_timeout;
    private String swapuse;
    private String sync_state;
    private String sync_target;
    private String sync_tgt_zpool;
    private String sysvmsg;
    private String sysvsem;
    private String sysvshm;
    private Integer template;
    private String type;
    private String used;
    private String vmemoryuse;
    private Integer vnet;
    private String vnet0_mac;
    private String vnet1_mac;
    private String vnet2_mac;
    private String vnet3_mac;
    private String vnet_default_interface;
    private String vnet_interfaces;
    private String wallclock;
    private String writebps;
    private String writeiops;
    private String id;

    private LocalDateTime dataAtual;

    public Jails(String host_hostname) {
    }

    public Jails(Integer CONFIG_VERSION, Integer allow_chflag, Integer allow_mlock, Integer allow_mount, Integer allow_mount_devfs, Integer allow_mount_fusefs, Integer allow_mount_nullf, Integer allow_mount_procfs, Integer allow_mount_tmpfs, Integer allow_mount_zfs, Integer allow_quotas, Integer allow_raw_sockets, Integer allow_set_hostname, Integer allow_socket_af, Integer allow_sysvipc, Integer allow_tun, Integer allow_vmm, Integer assign_localhost, String available, Integer basejail, Integer boot, Integer bpf, String children_max, String cloned_release, String comment, String compression, String compressratio, String coredumpsize, String count, String cpuset, String cputime, String datasize, String dedup, String defaultrouter, String defaultrouter6, String depends, String devfs_ruleset, Integer dhcp, String enforce_statfs, Integer exec_clean, String exec_created, String exec_fib, String exec_jail_user, String exec_poststart, String exec_poststop, String exec_prestart, String exec_prestop, String exec_start, String exec_stop, String exec_system_jail_user, String exec_system_user, String exec_timeout, String host_domainname, String host_hostname, String host_hostuuid, Integer host_time, String hostid, Integer hostid_strict_check, String interfaces, String ip4, String ip4_addr, Integer ip4_saddrsel, String ip6, String ip6_addr, Integer ip6_saddrsel, Integer ip_hostname, Integer jail_zfs, String jail_zfs_dataset, String jail_zfs_mountpoint, String last_started, String localhost_ip, String login_flags, String mac_prefix, String maxproc, String memorylocked, String memoryuse, Integer mount_devfs, Integer mount_fdescfs, Integer mount_linprocfs, Integer mount_procfs, String mountpoint, String msgqqueued, String msgqsize, Integer nat, String nat_backend, String nat_forwards, String nat_interface, String nat_prefix, String nmsgq, String notes, String nsem, String nsemop, String nshm, String nthr, String openfiles, String origin, String owner, String pcpu, String plugin_name, String plugin_repository, String priority, String pseudoterminals, String quota, String readbps, String readiops, String release, String reservation, String resolver, String rlimits, Integer rtsold, String securelevel, String shmsize, String stacksize, String state, String stop_timeout, String swapuse, String sync_state, String sync_target, String sync_tgt_zpool, String sysvmsg, String sysvsem, String sysvshm, Integer template, String type, String used, String vmemoryuse, Integer vnet, String vnet0_mac, String vnet1_mac, String vnet2_mac, String vnet3_mac, String vnet_default_interface, String vnet_interfaces, String wallclock, String writebps, String writeiops, String id, LocalDateTime dataAtual) {
        this.CONFIG_VERSION = CONFIG_VERSION;
        this.allow_chflag = allow_chflag;
        this.allow_mlock = allow_mlock;
        this.allow_mount = allow_mount;
        this.allow_mount_devfs = allow_mount_devfs;
        this.allow_mount_fusefs = allow_mount_fusefs;
        this.allow_mount_nullf = allow_mount_nullf;
        this.allow_mount_procfs = allow_mount_procfs;
        this.allow_mount_tmpfs = allow_mount_tmpfs;
        this.allow_mount_zfs = allow_mount_zfs;
        this.allow_quotas = allow_quotas;
        this.allow_raw_sockets = allow_raw_sockets;
        this.allow_set_hostname = allow_set_hostname;
        this.allow_socket_af = allow_socket_af;
        this.allow_sysvipc = allow_sysvipc;
        this.allow_tun = allow_tun;
        this.allow_vmm = allow_vmm;
        this.assign_localhost = assign_localhost;
        this.available = available;
        this.basejail = basejail;
        this.boot = boot;
        this.bpf = bpf;
        this.children_max = children_max;
        this.cloned_release = cloned_release;
        this.comment = comment;
        this.compression = compression;
        this.compressratio = compressratio;
        this.coredumpsize = coredumpsize;
        this.count = count;
        this.cpuset = cpuset;
        this.cputime = cputime;
        this.datasize = datasize;
        this.dedup = dedup;
        this.defaultrouter = defaultrouter;
        this.defaultrouter6 = defaultrouter6;
        this.depends = depends;
        this.devfs_ruleset = devfs_ruleset;
        this.dhcp = dhcp;
        this.enforce_statfs = enforce_statfs;
        this.exec_clean = exec_clean;
        this.exec_created = exec_created;
        this.exec_fib = exec_fib;
        this.exec_jail_user = exec_jail_user;
        this.exec_poststart = exec_poststart;
        this.exec_poststop = exec_poststop;
        this.exec_prestart = exec_prestart;
        this.exec_prestop = exec_prestop;
        this.exec_start = exec_start;
        this.exec_stop = exec_stop;
        this.exec_system_jail_user = exec_system_jail_user;
        this.exec_system_user = exec_system_user;
        this.exec_timeout = exec_timeout;
        this.host_domainname = host_domainname;
        this.host_hostname = host_hostname;
        this.host_hostuuid = host_hostuuid;
        this.host_time = host_time;
        this.hostid = hostid;
        this.hostid_strict_check = hostid_strict_check;
        this.interfaces = interfaces;
        this.ip4 = ip4;
        this.ip4_addr = ip4_addr;
        this.ip4_saddrsel = ip4_saddrsel;
        this.ip6 = ip6;
        this.ip6_addr = ip6_addr;
        this.ip6_saddrsel = ip6_saddrsel;
        this.ip_hostname = ip_hostname;
        this.jail_zfs = jail_zfs;
        this.jail_zfs_dataset = jail_zfs_dataset;
        this.jail_zfs_mountpoint = jail_zfs_mountpoint;
        this.last_started = last_started;
        this.localhost_ip = localhost_ip;
        this.login_flags = login_flags;
        this.mac_prefix = mac_prefix;
        this.maxproc = maxproc;
        this.memorylocked = memorylocked;
        this.memoryuse = memoryuse;
        this.mount_devfs = mount_devfs;
        this.mount_fdescfs = mount_fdescfs;
        this.mount_linprocfs = mount_linprocfs;
        this.mount_procfs = mount_procfs;
        this.mountpoint = mountpoint;
        this.msgqqueued = msgqqueued;
        this.msgqsize = msgqsize;
        this.nat = nat;
        this.nat_backend = nat_backend;
        this.nat_forwards = nat_forwards;
        this.nat_interface = nat_interface;
        this.nat_prefix = nat_prefix;
        this.nmsgq = nmsgq;
        this.notes = notes;
        this.nsem = nsem;
        this.nsemop = nsemop;
        this.nshm = nshm;
        this.nthr = nthr;
        this.openfiles = openfiles;
        this.origin = origin;
        this.owner = owner;
        this.pcpu = pcpu;
        this.plugin_name = plugin_name;
        this.plugin_repository = plugin_repository;
        this.priority = priority;
        this.pseudoterminals = pseudoterminals;
        this.quota = quota;
        this.readbps = readbps;
        this.readiops = readiops;
        this.release = release;
        this.reservation = reservation;
        this.resolver = resolver;
        this.rlimits = rlimits;
        this.rtsold = rtsold;
        this.securelevel = securelevel;
        this.shmsize = shmsize;
        this.stacksize = stacksize;
        this.state = state;
        this.stop_timeout = stop_timeout;
        this.swapuse = swapuse;
        this.sync_state = sync_state;
        this.sync_target = sync_target;
        this.sync_tgt_zpool = sync_tgt_zpool;
        this.sysvmsg = sysvmsg;
        this.sysvsem = sysvsem;
        this.sysvshm = sysvshm;
        this.template = template;
        this.type = type;
        this.used = used;
        this.vmemoryuse = vmemoryuse;
        this.vnet = vnet;
        this.vnet0_mac = vnet0_mac;
        this.vnet1_mac = vnet1_mac;
        this.vnet2_mac = vnet2_mac;
        this.vnet3_mac = vnet3_mac;
        this.vnet_default_interface = vnet_default_interface;
        this.vnet_interfaces = vnet_interfaces;
        this.wallclock = wallclock;
        this.writebps = writebps;
        this.writeiops = writeiops;
        this.id = id;
        this.dataAtual = LocalDateTime.now();
    }

    public Jails(Jails jails) {
    }

    public Integer getCONFIG_VERSION() {
        return CONFIG_VERSION;
    }

    public void setCONFIG_VERSION(Integer CONFIG_VERSION) {
        this.CONFIG_VERSION = CONFIG_VERSION;
    }

    public Integer getAllow_chflag() {
        return allow_chflag;
    }

    public void setAllow_chflag(Integer allow_chflag) {
        this.allow_chflag = allow_chflag;
    }

    public Integer getAllow_mlock() {
        return allow_mlock;
    }

    public void setAllow_mlock(Integer allow_mlock) {
        this.allow_mlock = allow_mlock;
    }

    public Integer getAllow_mount() {
        return allow_mount;
    }

    public void setAllow_mount(Integer allow_mount) {
        this.allow_mount = allow_mount;
    }

    public Integer getAllow_mount_devfs() {
        return allow_mount_devfs;
    }

    public void setAllow_mount_devfs(Integer allow_mount_devfs) {
        this.allow_mount_devfs = allow_mount_devfs;
    }

    public Integer getAllow_mount_fusefs() {
        return allow_mount_fusefs;
    }

    public void setAllow_mount_fusefs(Integer allow_mount_fusefs) {
        this.allow_mount_fusefs = allow_mount_fusefs;
    }

    public Integer getAllow_mount_nullf() {
        return allow_mount_nullf;
    }

    public void setAllow_mount_nullf(Integer allow_mount_nullf) {
        this.allow_mount_nullf = allow_mount_nullf;
    }

    public Integer getAllow_mount_procfs() {
        return allow_mount_procfs;
    }

    public void setAllow_mount_procfs(Integer allow_mount_procfs) {
        this.allow_mount_procfs = allow_mount_procfs;
    }

    public Integer getAllow_mount_tmpfs() {
        return allow_mount_tmpfs;
    }

    public void setAllow_mount_tmpfs(Integer allow_mount_tmpfs) {
        this.allow_mount_tmpfs = allow_mount_tmpfs;
    }

    public Integer getAllow_mount_zfs() {
        return allow_mount_zfs;
    }

    public void setAllow_mount_zfs(Integer allow_mount_zfs) {
        this.allow_mount_zfs = allow_mount_zfs;
    }

    public Integer getAllow_quotas() {
        return allow_quotas;
    }

    public void setAllow_quotas(Integer allow_quotas) {
        this.allow_quotas = allow_quotas;
    }

    public Integer getAllow_raw_sockets() {
        return allow_raw_sockets;
    }

    public void setAllow_raw_sockets(Integer allow_raw_sockets) {
        this.allow_raw_sockets = allow_raw_sockets;
    }

    public Integer getAllow_set_hostname() {
        return allow_set_hostname;
    }

    public void setAllow_set_hostname(Integer allow_set_hostname) {
        this.allow_set_hostname = allow_set_hostname;
    }

    public Integer getAllow_socket_af() {
        return allow_socket_af;
    }

    public void setAllow_socket_af(Integer allow_socket_af) {
        this.allow_socket_af = allow_socket_af;
    }

    public Integer getAllow_sysvipc() {
        return allow_sysvipc;
    }

    public void setAllow_sysvipc(Integer allow_sysvipc) {
        this.allow_sysvipc = allow_sysvipc;
    }

    public Integer getAllow_tun() {
        return allow_tun;
    }

    public void setAllow_tun(Integer allow_tun) {
        this.allow_tun = allow_tun;
    }

    public Integer getAllow_vmm() {
        return allow_vmm;
    }

    public void setAllow_vmm(Integer allow_vmm) {
        this.allow_vmm = allow_vmm;
    }

    public Integer getAssign_localhost() {
        return assign_localhost;
    }

    public void setAssign_localhost(Integer assign_localhost) {
        this.assign_localhost = assign_localhost;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Integer getBasejail() {
        return basejail;
    }

    public void setBasejail(Integer basejail) {
        this.basejail = basejail;
    }

    public Integer getBoot() {
        return boot;
    }

    public void setBoot(Integer boot) {
        this.boot = boot;
    }

    public Integer getBpf() {
        return bpf;
    }

    public void setBpf(Integer bpf) {
        this.bpf = bpf;
    }

    public String getChildren_max() {
        return children_max;
    }

    public void setChildren_max(String children_max) {
        this.children_max = children_max;
    }

    public String getCloned_release() {
        return cloned_release;
    }

    public void setCloned_release(String cloned_release) {
        this.cloned_release = cloned_release;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }

    public String getCompressratio() {
        return compressratio;
    }

    public void setCompressratio(String compressratio) {
        this.compressratio = compressratio;
    }

    public String getCoredumpsize() {
        return coredumpsize;
    }

    public void setCoredumpsize(String coredumpsize) {
        this.coredumpsize = coredumpsize;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCpuset() {
        return cpuset;
    }

    public void setCpuset(String cpuset) {
        this.cpuset = cpuset;
    }

    public String getCputime() {
        return cputime;
    }

    public void setCputime(String cputime) {
        this.cputime = cputime;
    }

    public String getDatasize() {
        return datasize;
    }

    public void setDatasize(String datasize) {
        this.datasize = datasize;
    }

    public String getDedup() {
        return dedup;
    }

    public void setDedup(String dedup) {
        this.dedup = dedup;
    }

    public String getDefaultrouter() {
        return defaultrouter;
    }

    public void setDefaultrouter(String defaultrouter) {
        this.defaultrouter = defaultrouter;
    }

    public String getDefaultrouter6() {
        return defaultrouter6;
    }

    public void setDefaultrouter6(String defaultrouter6) {
        this.defaultrouter6 = defaultrouter6;
    }

    public String getDepends() {
        return depends;
    }

    public void setDepends(String depends) {
        this.depends = depends;
    }

    public String getDevfs_ruleset() {
        return devfs_ruleset;
    }

    public void setDevfs_ruleset(String devfs_ruleset) {
        this.devfs_ruleset = devfs_ruleset;
    }

    public Integer getDhcp() {
        return dhcp;
    }

    public void setDhcp(Integer dhcp) {
        this.dhcp = dhcp;
    }

    public String getEnforce_statfs() {
        return enforce_statfs;
    }

    public void setEnforce_statfs(String enforce_statfs) {
        this.enforce_statfs = enforce_statfs;
    }

    public Integer getExec_clean() {
        return exec_clean;
    }

    public void setExec_clean(Integer exec_clean) {
        this.exec_clean = exec_clean;
    }

    public String getExec_created() {
        return exec_created;
    }

    public void setExec_created(String exec_created) {
        this.exec_created = exec_created;
    }

    public String getExec_fib() {
        return exec_fib;
    }

    public void setExec_fib(String exec_fib) {
        this.exec_fib = exec_fib;
    }

    public String getExec_jail_user() {
        return exec_jail_user;
    }

    public void setExec_jail_user(String exec_jail_user) {
        this.exec_jail_user = exec_jail_user;
    }

    public String getExec_poststart() {
        return exec_poststart;
    }

    public void setExec_poststart(String exec_poststart) {
        this.exec_poststart = exec_poststart;
    }

    public String getExec_poststop() {
        return exec_poststop;
    }

    public void setExec_poststop(String exec_poststop) {
        this.exec_poststop = exec_poststop;
    }

    public String getExec_prestart() {
        return exec_prestart;
    }

    public void setExec_prestart(String exec_prestart) {
        this.exec_prestart = exec_prestart;
    }

    public String getExec_prestop() {
        return exec_prestop;
    }

    public void setExec_prestop(String exec_prestop) {
        this.exec_prestop = exec_prestop;
    }

    public String getExec_start() {
        return exec_start;
    }

    public void setExec_start(String exec_start) {
        this.exec_start = exec_start;
    }

    public String getExec_stop() {
        return exec_stop;
    }

    public void setExec_stop(String exec_stop) {
        this.exec_stop = exec_stop;
    }

    public String getExec_system_jail_user() {
        return exec_system_jail_user;
    }

    public void setExec_system_jail_user(String exec_system_jail_user) {
        this.exec_system_jail_user = exec_system_jail_user;
    }

    public String getExec_system_user() {
        return exec_system_user;
    }

    public void setExec_system_user(String exec_system_user) {
        this.exec_system_user = exec_system_user;
    }

    public String getExec_timeout() {
        return exec_timeout;
    }

    public void setExec_timeout(String exec_timeout) {
        this.exec_timeout = exec_timeout;
    }

    public String getHost_domainname() {
        return host_domainname;
    }

    public void setHost_domainname(String host_domainname) {
        this.host_domainname = host_domainname;
    }

    public String getHost_hostname() {
        return host_hostname;
    }

    public void setHost_hostname(String host_hostname) {
        this.host_hostname = host_hostname;
    }

    public String getHost_hostuuid() {
        return host_hostuuid;
    }

    public void setHost_hostuuid(String host_hostuuid) {
        this.host_hostuuid = host_hostuuid;
    }

    public Integer getHost_time() {
        return host_time;
    }

    public void setHost_time(Integer host_time) {
        this.host_time = host_time;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public Integer getHostid_strict_check() {
        return hostid_strict_check;
    }

    public void setHostid_strict_check(Integer hostid_strict_check) {
        this.hostid_strict_check = hostid_strict_check;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public String getIp4() {
        return ip4;
    }

    public void setIp4(String ip4) {
        this.ip4 = ip4;
    }

    public String getIp4_addr() {
        return ip4_addr;
    }

    public void setIp4_addr(String ip4_addr) {
        this.ip4_addr = ip4_addr;
    }

    public Integer getIp4_saddrsel() {
        return ip4_saddrsel;
    }

    public void setIp4_saddrsel(Integer ip4_saddrsel) {
        this.ip4_saddrsel = ip4_saddrsel;
    }

    public String getIp6() {
        return ip6;
    }

    public void setIp6(String ip6) {
        this.ip6 = ip6;
    }

    public String getIp6_addr() {
        return ip6_addr;
    }

    public void setIp6_addr(String ip6_addr) {
        this.ip6_addr = ip6_addr;
    }

    public Integer getIp6_saddrsel() {
        return ip6_saddrsel;
    }

    public void setIp6_saddrsel(Integer ip6_saddrsel) {
        this.ip6_saddrsel = ip6_saddrsel;
    }

    public Integer getIp_hostname() {
        return ip_hostname;
    }

    public void setIp_hostname(Integer ip_hostname) {
        this.ip_hostname = ip_hostname;
    }

    public Integer getJail_zfs() {
        return jail_zfs;
    }

    public void setJail_zfs(Integer jail_zfs) {
        this.jail_zfs = jail_zfs;
    }

    public String getJail_zfs_dataset() {
        return jail_zfs_dataset;
    }

    public void setJail_zfs_dataset(String jail_zfs_dataset) {
        this.jail_zfs_dataset = jail_zfs_dataset;
    }

    public String getJail_zfs_mountpoint() {
        return jail_zfs_mountpoint;
    }

    public void setJail_zfs_mountpoint(String jail_zfs_mountpoint) {
        this.jail_zfs_mountpoint = jail_zfs_mountpoint;
    }

    public String getLast_started() {
        return last_started;
    }

    public void setLast_started(String last_started) {
        this.last_started = last_started;
    }

    public String getLocalhost_ip() {
        return localhost_ip;
    }

    public void setLocalhost_ip(String localhost_ip) {
        this.localhost_ip = localhost_ip;
    }

    public String getLogin_flags() {
        return login_flags;
    }

    public void setLogin_flags(String login_flags) {
        this.login_flags = login_flags;
    }

    public String getMac_prefix() {
        return mac_prefix;
    }

    public void setMac_prefix(String mac_prefix) {
        this.mac_prefix = mac_prefix;
    }

    public String getMaxproc() {
        return maxproc;
    }

    public void setMaxproc(String maxproc) {
        this.maxproc = maxproc;
    }

    public String getMemorylocked() {
        return memorylocked;
    }

    public void setMemorylocked(String memorylocked) {
        this.memorylocked = memorylocked;
    }

    public String getMemoryuse() {
        return memoryuse;
    }

    public void setMemoryuse(String memoryuse) {
        this.memoryuse = memoryuse;
    }

    public Integer getMount_devfs() {
        return mount_devfs;
    }

    public void setMount_devfs(Integer mount_devfs) {
        this.mount_devfs = mount_devfs;
    }

    public Integer getMount_fdescfs() {
        return mount_fdescfs;
    }

    public void setMount_fdescfs(Integer mount_fdescfs) {
        this.mount_fdescfs = mount_fdescfs;
    }

    public Integer getMount_linprocfs() {
        return mount_linprocfs;
    }

    public void setMount_linprocfs(Integer mount_linprocfs) {
        this.mount_linprocfs = mount_linprocfs;
    }

    public Integer getMount_procfs() {
        return mount_procfs;
    }

    public void setMount_procfs(Integer mount_procfs) {
        this.mount_procfs = mount_procfs;
    }

    public String getMountpoint() {
        return mountpoint;
    }

    public void setMountpoint(String mountpoint) {
        this.mountpoint = mountpoint;
    }

    public String getMsgqqueued() {
        return msgqqueued;
    }

    public void setMsgqqueued(String msgqqueued) {
        this.msgqqueued = msgqqueued;
    }

    public String getMsgqsize() {
        return msgqsize;
    }

    public void setMsgqsize(String msgqsize) {
        this.msgqsize = msgqsize;
    }

    public Integer getNat() {
        return nat;
    }

    public void setNat(Integer nat) {
        this.nat = nat;
    }

    public String getNat_backend() {
        return nat_backend;
    }

    public void setNat_backend(String nat_backend) {
        this.nat_backend = nat_backend;
    }

    public String getNat_forwards() {
        return nat_forwards;
    }

    public void setNat_forwards(String nat_forwards) {
        this.nat_forwards = nat_forwards;
    }

    public String getNat_interface() {
        return nat_interface;
    }

    public void setNat_interface(String nat_interface) {
        this.nat_interface = nat_interface;
    }

    public String getNat_prefix() {
        return nat_prefix;
    }

    public void setNat_prefix(String nat_prefix) {
        this.nat_prefix = nat_prefix;
    }

    public String getNmsgq() {
        return nmsgq;
    }

    public void setNmsgq(String nmsgq) {
        this.nmsgq = nmsgq;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNsem() {
        return nsem;
    }

    public void setNsem(String nsem) {
        this.nsem = nsem;
    }

    public String getNsemop() {
        return nsemop;
    }

    public void setNsemop(String nsemop) {
        this.nsemop = nsemop;
    }

    public String getNshm() {
        return nshm;
    }

    public void setNshm(String nshm) {
        this.nshm = nshm;
    }

    public String getNthr() {
        return nthr;
    }

    public void setNthr(String nthr) {
        this.nthr = nthr;
    }

    public String getOpenfiles() {
        return openfiles;
    }

    public void setOpenfiles(String openfiles) {
        this.openfiles = openfiles;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPcpu() {
        return pcpu;
    }

    public void setPcpu(String pcpu) {
        this.pcpu = pcpu;
    }

    public String getPlugin_name() {
        return plugin_name;
    }

    public void setPlugin_name(String plugin_name) {
        this.plugin_name = plugin_name;
    }

    public String getPlugin_repository() {
        return plugin_repository;
    }

    public void setPlugin_repository(String plugin_repository) {
        this.plugin_repository = plugin_repository;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPseudoterminals() {
        return pseudoterminals;
    }

    public void setPseudoterminals(String pseudoterminals) {
        this.pseudoterminals = pseudoterminals;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getReadbps() {
        return readbps;
    }

    public void setReadbps(String readbps) {
        this.readbps = readbps;
    }

    public String getReadiops() {
        return readiops;
    }

    public void setReadiops(String readiops) {
        this.readiops = readiops;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public String getResolver() {
        return resolver;
    }

    public void setResolver(String resolver) {
        this.resolver = resolver;
    }

    public String getRlimits() {
        return rlimits;
    }

    public void setRlimits(String rlimits) {
        this.rlimits = rlimits;
    }

    public Integer getRtsold() {
        return rtsold;
    }

    public void setRtsold(Integer rtsold) {
        this.rtsold = rtsold;
    }

    public String getSecurelevel() {
        return securelevel;
    }

    public void setSecurelevel(String securelevel) {
        this.securelevel = securelevel;
    }

    public String getShmsize() {
        return shmsize;
    }

    public void setShmsize(String shmsize) {
        this.shmsize = shmsize;
    }

    public String getStacksize() {
        return stacksize;
    }

    public void setStacksize(String stacksize) {
        this.stacksize = stacksize;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStop_timeout() {
        return stop_timeout;
    }

    public void setStop_timeout(String stop_timeout) {
        this.stop_timeout = stop_timeout;
    }

    public String getSwapuse() {
        return swapuse;
    }

    public void setSwapuse(String swapuse) {
        this.swapuse = swapuse;
    }

    public String getSync_state() {
        return sync_state;
    }

    public void setSync_state(String sync_state) {
        this.sync_state = sync_state;
    }

    public String getSync_target() {
        return sync_target;
    }

    public void setSync_target(String sync_target) {
        this.sync_target = sync_target;
    }

    public String getSync_tgt_zpool() {
        return sync_tgt_zpool;
    }

    public void setSync_tgt_zpool(String sync_tgt_zpool) {
        this.sync_tgt_zpool = sync_tgt_zpool;
    }

    public String getSysvmsg() {
        return sysvmsg;
    }

    public void setSysvmsg(String sysvmsg) {
        this.sysvmsg = sysvmsg;
    }

    public String getSysvsem() {
        return sysvsem;
    }

    public void setSysvsem(String sysvsem) {
        this.sysvsem = sysvsem;
    }

    public String getSysvshm() {
        return sysvshm;
    }

    public void setSysvshm(String sysvshm) {
        this.sysvshm = sysvshm;
    }

    public Integer getTemplate() {
        return template;
    }

    public void setTemplate(Integer template) {
        this.template = template;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getVmemoryuse() {
        return vmemoryuse;
    }

    public void setVmemoryuse(String vmemoryuse) {
        this.vmemoryuse = vmemoryuse;
    }

    public Integer getVnet() {
        return vnet;
    }

    public void setVnet(Integer vnet) {
        this.vnet = vnet;
    }

    public String getVnet0_mac() {
        return vnet0_mac;
    }

    public void setVnet0_mac(String vnet0_mac) {
        this.vnet0_mac = vnet0_mac;
    }

    public String getVnet1_mac() {
        return vnet1_mac;
    }

    public void setVnet1_mac(String vnet1_mac) {
        this.vnet1_mac = vnet1_mac;
    }

    public String getVnet2_mac() {
        return vnet2_mac;
    }

    public void setVnet2_mac(String vnet2_mac) {
        this.vnet2_mac = vnet2_mac;
    }

    public String getVnet3_mac() {
        return vnet3_mac;
    }

    public void setVnet3_mac(String vnet3_mac) {
        this.vnet3_mac = vnet3_mac;
    }

    public String getVnet_default_interface() {
        return vnet_default_interface;
    }

    public void setVnet_default_interface(String vnet_default_interface) {
        this.vnet_default_interface = vnet_default_interface;
    }

    public String getVnet_interfaces() {
        return vnet_interfaces;
    }

    public void setVnet_interfaces(String vnet_interfaces) {
        this.vnet_interfaces = vnet_interfaces;
    }

    public String getWallclock() {
        return wallclock;
    }

    public void setWallclock(String wallclock) {
        this.wallclock = wallclock;
    }

    public String getWritebps() {
        return writebps;
    }

    public void setWritebps(String writebps) {
        this.writebps = writebps;
    }

    public String getWriteiops() {
        return writeiops;
    }

    public void setWriteiops(String writeiops) {
        this.writeiops = writeiops;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDateTime dataAtual) {
        this.dataAtual = dataAtual;
    }


    @Override
    public String toString() {
        return "Jails{" +
                "CONFIG_VERSION=" + CONFIG_VERSION +
                ", allow_chflag=" + allow_chflag +
                ", allow_mlock=" + allow_mlock +
                ", allow_mount=" + allow_mount +
                ", allow_mount_devfs=" + allow_mount_devfs +
                ", allow_mount_fusefs=" + allow_mount_fusefs +
                ", allow_mount_nullf=" + allow_mount_nullf +
                ", allow_mount_procfs=" + allow_mount_procfs +
                ", allow_mount_tmpfs=" + allow_mount_tmpfs +
                ", allow_mount_zfs=" + allow_mount_zfs +
                ", allow_quotas=" + allow_quotas +
                ", allow_raw_sockets=" + allow_raw_sockets +
                ", allow_set_hostname=" + allow_set_hostname +
                ", allow_socket_af=" + allow_socket_af +
                ", allow_sysvipc=" + allow_sysvipc +
                ", allow_tun=" + allow_tun +
                ", allow_vmm=" + allow_vmm +
                ", assign_localhost=" + assign_localhost +
                ", available='" + available + '\'' +
                ", basejail=" + basejail +
                ", boot=" + boot +
                ", bpf=" + bpf +
                ", children_max='" + children_max + '\'' +
                ", cloned_release='" + cloned_release + '\'' +
                ", comment='" + comment + '\'' +
                ", compression='" + compression + '\'' +
                ", compressratio='" + compressratio + '\'' +
                ", coredumpsize='" + coredumpsize + '\'' +
                ", count='" + count + '\'' +
                ", cpuset='" + cpuset + '\'' +
                ", cputime='" + cputime + '\'' +
                ", datasize='" + datasize + '\'' +
                ", dedup='" + dedup + '\'' +
                ", defaultrouter='" + defaultrouter + '\'' +
                ", defaultrouter6='" + defaultrouter6 + '\'' +
                ", depends='" + depends + '\'' +
                ", devfs_ruleset='" + devfs_ruleset + '\'' +
                ", dhcp=" + dhcp +
                ", enforce_statfs='" + enforce_statfs + '\'' +
                ", exec_clean=" + exec_clean +
                ", exec_created='" + exec_created + '\'' +
                ", exec_fib='" + exec_fib + '\'' +
                ", exec_jail_user='" + exec_jail_user + '\'' +
                ", exec_poststart='" + exec_poststart + '\'' +
                ", exec_poststop='" + exec_poststop + '\'' +
                ", exec_prestart='" + exec_prestart + '\'' +
                ", exec_prestop='" + exec_prestop + '\'' +
                ", exec_start='" + exec_start + '\'' +
                ", exec_stop='" + exec_stop + '\'' +
                ", exec_system_jail_user='" + exec_system_jail_user + '\'' +
                ", exec_system_user='" + exec_system_user + '\'' +
                ", exec_timeout='" + exec_timeout + '\'' +
                ", host_domainname='" + host_domainname + '\'' +
                ", host_hostname='" + host_hostname + '\'' +
                ", host_hostuuid='" + host_hostuuid + '\'' +
                ", host_time=" + host_time +
                ", hostid='" + hostid + '\'' +
                ", hostid_strict_check=" + hostid_strict_check +
                ", interfaces='" + interfaces + '\'' +
                ", ip4='" + ip4 + '\'' +
                ", ip4_addr='" + ip4_addr + '\'' +
                ", ip4_saddrsel=" + ip4_saddrsel +
                ", ip6='" + ip6 + '\'' +
                ", ip6_addr='" + ip6_addr + '\'' +
                ", ip6_saddrsel=" + ip6_saddrsel +
                ", ip_hostname=" + ip_hostname +
                ", jail_zfs=" + jail_zfs +
                ", jail_zfs_dataset='" + jail_zfs_dataset + '\'' +
                ", jail_zfs_mountpoint='" + jail_zfs_mountpoint + '\'' +
                ", last_started='" + last_started + '\'' +
                ", localhost_ip='" + localhost_ip + '\'' +
                ", login_flags='" + login_flags + '\'' +
                ", mac_prefix='" + mac_prefix + '\'' +
                ", maxproc='" + maxproc + '\'' +
                ", memorylocked='" + memorylocked + '\'' +
                ", memoryuse='" + memoryuse + '\'' +
                ", mount_devfs=" + mount_devfs +
                ", mount_fdescfs=" + mount_fdescfs +
                ", mount_linprocfs=" + mount_linprocfs +
                ", mount_procfs=" + mount_procfs +
                ", mountpoint='" + mountpoint + '\'' +
                ", msgqqueued='" + msgqqueued + '\'' +
                ", msgqsize='" + msgqsize + '\'' +
                ", nat=" + nat +
                ", nat_backend='" + nat_backend + '\'' +
                ", nat_forwards='" + nat_forwards + '\'' +
                ", nat_interface='" + nat_interface + '\'' +
                ", nat_prefix='" + nat_prefix + '\'' +
                ", nmsgq='" + nmsgq + '\'' +
                ", notes='" + notes + '\'' +
                ", nsem='" + nsem + '\'' +
                ", nsemop='" + nsemop + '\'' +
                ", nshm='" + nshm + '\'' +
                ", nthr='" + nthr + '\'' +
                ", openfiles='" + openfiles + '\'' +
                ", origin='" + origin + '\'' +
                ", owner='" + owner + '\'' +
                ", pcpu='" + pcpu + '\'' +
                ", plugin_name='" + plugin_name + '\'' +
                ", plugin_repository='" + plugin_repository + '\'' +
                ", priority='" + priority + '\'' +
                ", pseudoterminals='" + pseudoterminals + '\'' +
                ", quota='" + quota + '\'' +
                ", readbps='" + readbps + '\'' +
                ", readiops='" + readiops + '\'' +
                ", release='" + release + '\'' +
                ", reservation='" + reservation + '\'' +
                ", resolver='" + resolver + '\'' +
                ", rlimits='" + rlimits + '\'' +
                ", rtsold=" + rtsold +
                ", securelevel='" + securelevel + '\'' +
                ", shmsize='" + shmsize + '\'' +
                ", stacksize='" + stacksize + '\'' +
                ", state='" + state + '\'' +
                ", stop_timeout='" + stop_timeout + '\'' +
                ", swapuse='" + swapuse + '\'' +
                ", sync_state='" + sync_state + '\'' +
                ", sync_target='" + sync_target + '\'' +
                ", sync_tgt_zpool='" + sync_tgt_zpool + '\'' +
                ", sysvmsg='" + sysvmsg + '\'' +
                ", sysvsem='" + sysvsem + '\'' +
                ", sysvshm='" + sysvshm + '\'' +
                ", template=" + template +
                ", type='" + type + '\'' +
                ", used='" + used + '\'' +
                ", vmemoryuse='" + vmemoryuse + '\'' +
                ", vnet=" + vnet +
                ", vnet0_mac='" + vnet0_mac + '\'' +
                ", vnet1_mac='" + vnet1_mac + '\'' +
                ", vnet2_mac='" + vnet2_mac + '\'' +
                ", vnet3_mac='" + vnet3_mac + '\'' +
                ", vnet_default_interface='" + vnet_default_interface + '\'' +
                ", vnet_interfaces='" + vnet_interfaces + '\'' +
                ", wallclock='" + wallclock + '\'' +
                ", writebps='" + writebps + '\'' +
                ", writeiops='" + writeiops + '\'' +
                ", id='" + id + '\'' +
                ", dataAtual=" + dataAtual +
                '}';
    }
}