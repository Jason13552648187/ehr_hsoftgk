package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdlzmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdlzmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdlzmxMappingImpl implements PcmYdlzmxMapping {

    @Override
    public PcmYdlzmx toDomain(PcmYdlzmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdlzmx pcmYdlzmx = new PcmYdlzmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdlzmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdlzmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSfhmd() != null ) {
            pcmYdlzmx.setSfhmd( dto.getSfhmd() );
        }
        if ( dto.getYytype() != null ) {
            pcmYdlzmx.setYytype( dto.getYytype() );
        }
        if ( dto.getFj() != null ) {
            pcmYdlzmx.setFj( dto.getFj() );
        }
        if ( dto.getBz() != null ) {
            pcmYdlzmx.setBz( dto.getBz() );
        }
        if ( dto.getPcmydlzmxname() != null ) {
            pcmYdlzmx.setPcmydlzmxname( dto.getPcmydlzmxname() );
        }
        if ( dto.getCz() != null ) {
            pcmYdlzmx.setCz( dto.getCz() );
        }
        if ( dto.getRemarks() != null ) {
            pcmYdlzmx.setRemarks( dto.getRemarks() );
        }
        if ( dto.getLzqx() != null ) {
            pcmYdlzmx.setLzqx( dto.getLzqx() );
        }
        if ( dto.getLzmtrname() != null ) {
            pcmYdlzmx.setLzmtrname( dto.getLzmtrname() );
        }
        if ( dto.getLzmtrid() != null ) {
            pcmYdlzmx.setLzmtrid( dto.getLzmtrid() );
        }
        if ( dto.getIsfinished() != null ) {
            pcmYdlzmx.setIsfinished( dto.getIsfinished() );
        }
        if ( dto.getNl() != null ) {
            pcmYdlzmx.setNl( dto.getNl() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdlzmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdlzmx.setZzid( dto.getZzid() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdlzmx.setYrank( dto.getYrank() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdlzmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdlzmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getBm() != null ) {
            pcmYdlzmx.setBm( dto.getBm() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdlzmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdlzmx.setShortname( dto.getShortname() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdlzmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdlzmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdlzmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdlzmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdlzmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdlzmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdlzmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdlzmx.setBmid( dto.getBmid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdlzmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdlzmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdlzmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdlzmx.setYzw( dto.getYzw() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdlzmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdlzmx.setYgw( dto.getYgw() );
        }
        if ( dto.getZz() != null ) {
            pcmYdlzmx.setZz( dto.getZz() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdlzmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmydlzmxid() != null ) {
            pcmYdlzmx.setPcmydlzmxid( dto.getPcmydlzmxid() );
        }

        return pcmYdlzmx;
    }

    @Override
    public PcmYdlzmxDTO toDto(PcmYdlzmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdlzmxDTO pcmYdlzmxDTO = new PcmYdlzmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdlzmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdlzmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSfhmd() != null ) {
            pcmYdlzmxDTO.setSfhmd( entity.getSfhmd() );
        }
        if ( entity.getYytype() != null ) {
            pcmYdlzmxDTO.setYytype( entity.getYytype() );
        }
        if ( entity.getFj() != null ) {
            pcmYdlzmxDTO.setFj( entity.getFj() );
        }
        if ( entity.getBz() != null ) {
            pcmYdlzmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getPcmydlzmxname() != null ) {
            pcmYdlzmxDTO.setPcmydlzmxname( entity.getPcmydlzmxname() );
        }
        if ( entity.getCz() != null ) {
            pcmYdlzmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getRemarks() != null ) {
            pcmYdlzmxDTO.setRemarks( entity.getRemarks() );
        }
        if ( entity.getLzqx() != null ) {
            pcmYdlzmxDTO.setLzqx( entity.getLzqx() );
        }
        if ( entity.getLzmtrname() != null ) {
            pcmYdlzmxDTO.setLzmtrname( entity.getLzmtrname() );
        }
        if ( entity.getLzmtrid() != null ) {
            pcmYdlzmxDTO.setLzmtrid( entity.getLzmtrid() );
        }
        if ( entity.getIsfinished() != null ) {
            pcmYdlzmxDTO.setIsfinished( entity.getIsfinished() );
        }
        if ( entity.getNl() != null ) {
            pcmYdlzmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdlzmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdlzmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdlzmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdlzmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdlzmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getBm() != null ) {
            pcmYdlzmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdlzmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdlzmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdlzmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdlzmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdlzmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdlzmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdlzmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdlzmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdlzmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdlzmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdlzmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdlzmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdlzmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdlzmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdlzmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdlzmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getZz() != null ) {
            pcmYdlzmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdlzmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmydlzmxid() != null ) {
            pcmYdlzmxDTO.setPcmydlzmxid( entity.getPcmydlzmxid() );
        }

        return pcmYdlzmxDTO;
    }

    @Override
    public List<PcmYdlzmx> toDomain(List<PcmYdlzmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdlzmx> list = new ArrayList<PcmYdlzmx>( dtoList.size() );
        for ( PcmYdlzmxDTO pcmYdlzmxDTO : dtoList ) {
            list.add( toDomain( pcmYdlzmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdlzmxDTO> toDto(List<PcmYdlzmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdlzmxDTO> list = new ArrayList<PcmYdlzmxDTO>( entityList.size() );
        for ( PcmYdlzmx pcmYdlzmx : entityList ) {
            list.add( toDto( pcmYdlzmx ) );
        }

        return list;
    }
}
