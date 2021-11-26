package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdjdmx;
import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-18T11:09:13+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdjdmxInheritMappingImpl implements PcmYdjdmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdjdmx pcmydjdmx) {
        if ( pcmydjdmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydjdmx.getPcmydjdmxid() );
        pcmYdmx.setPcmydmxname( pcmydjdmx.getPcmydjdmxname() );
        Map<String, Object> map = pcmydjdmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setFinished( pcmydjdmx.getFinished() );
        pcmYdmx.setYzw( pcmydjdmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydjdmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydjdmx.getYrank() );
        pcmYdmx.setSxrq( pcmydjdmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydjdmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydjdmx.getYgw() );
        pcmYdmx.setYgbh( pcmydjdmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydjdmx.getZjhm() );
        pcmYdmx.setZz( pcmydjdmx.getZz() );
        pcmYdmx.setCsrq( pcmydjdmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydjdmx.getLxdh() );
        pcmYdmx.setNl( pcmydjdmx.getNl() );
        pcmYdmx.setBm( pcmydjdmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydjdmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydjdmx.getZzid() );
        pcmYdmx.setBmid( pcmydjdmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydjdmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydjdmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydjdmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydjdmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydjdmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydjdmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydjdmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdjdmx toPcmydjdmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdjdmx pcmYdjdmx = new PcmYdjdmx();

        pcmYdjdmx.setPcmydjdmxid( pcmydmx.getPcmydmxid() );
        pcmYdjdmx.setPcmydjdmxname( pcmydmx.getPcmydmxname() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdjdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdjdmx.setFinished( pcmydmx.getFinished() );
        pcmYdjdmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdjdmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYdjdmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdjdmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdjdmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdjdmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYdjdmx.setZz( pcmydmx.getZz() );
        pcmYdjdmx.setShortname( pcmydmx.getShortname() );
        pcmYdjdmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdjdmx.setBm( pcmydmx.getBm() );
        pcmYdjdmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdjdmx.setYgw( pcmydmx.getYgw() );
        pcmYdjdmx.setYrank( pcmydmx.getYrank() );
        pcmYdjdmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdjdmx.setBmid( pcmydmx.getBmid() );
        pcmYdjdmx.setYgbh( pcmydmx.getYgbh() );
        pcmYdjdmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdjdmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdjdmx.setYzw( pcmydmx.getYzw() );
        pcmYdjdmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdjdmx.setNl( pcmydmx.getNl() );
        pcmYdjdmx.setZzid( pcmydmx.getZzid() );
        pcmYdjdmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );

        return pcmYdjdmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdjdmx> pcmydjdmx) {
        if ( pcmydjdmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydjdmx.size() );
        for ( PcmYdjdmx pcmYdjdmx : pcmydjdmx ) {
            list.add( toPcmydmx( pcmYdjdmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdjdmx> toPcmydjdmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdjdmx> list = new ArrayList<PcmYdjdmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydjdmx( pcmYdmx ) );
        }

        return list;
    }
}
