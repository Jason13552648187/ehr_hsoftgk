package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYddgmx;
import cn.ibizlab.ehr.webapi.dto.PcmYddgmxDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYddgmxMappingImpl implements PcmYddgmxMapping {

    @Override
    public PcmYddgmx toDomain(PcmYddgmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYddgmx pcmYddgmx = new PcmYddgmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYddgmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYddgmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDgdq() != null ) {
            pcmYddgmx.setDgdq( dto.getDgdq() );
        }
        if ( dto.getJsrq() != null ) {
            pcmYddgmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getBz() != null ) {
            pcmYddgmx.setBz( dto.getBz() );
        }
        if ( dto.getPcmyddgmxname() != null ) {
            pcmYddgmx.setPcmyddgmxname( dto.getPcmyddgmxname() );
        }
        if ( dto.getDglx() != null ) {
            pcmYddgmx.setDglx( dto.getDglx() );
        }
        if ( dto.getDistirbutionid() != null ) {
            pcmYddgmx.setDistirbutionid( dto.getDistirbutionid() );
        }
        if ( dto.getCz() != null ) {
            pcmYddgmx.setCz( dto.getCz() );
        }
        if ( dto.getReason() != null ) {
            pcmYddgmx.setReason( dto.getReason() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmYddgmx.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getIsfinished() != null ) {
            pcmYddgmx.setIsfinished( dto.getIsfinished() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYddgmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getBmid() != null ) {
            pcmYddgmx.setBmid( dto.getBmid() );
        }
        if ( dto.getZz() != null ) {
            pcmYddgmx.setZz( dto.getZz() );
        }
        if ( dto.getYrank() != null ) {
            pcmYddgmx.setYrank( dto.getYrank() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYddgmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYddgmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYddgmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYddgmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getYgw() != null ) {
            pcmYddgmx.setYgw( dto.getYgw() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYddgmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYddgmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYddgmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYddgmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getYzw() != null ) {
            pcmYddgmx.setYzw( dto.getYzw() );
        }
        if ( dto.getShortname() != null ) {
            pcmYddgmx.setShortname( dto.getShortname() );
        }
        if ( dto.getPcmyddgmxid() != null ) {
            pcmYddgmx.setPcmyddgmxid( dto.getPcmyddgmxid() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYddgmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getNl() != null ) {
            pcmYddgmx.setNl( dto.getNl() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYddgmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYddgmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYddgmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getBm() != null ) {
            pcmYddgmx.setBm( dto.getBm() );
        }
        if ( dto.getZzid() != null ) {
            pcmYddgmx.setZzid( dto.getZzid() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYddgmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYddgmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYddgmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmYddgmx.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getDgshortname() != null ) {
            pcmYddgmx.setDgshortname( dto.getDgshortname() );
        }

        return pcmYddgmx;
    }

    @Override
    public PcmYddgmxDTO toDto(PcmYddgmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYddgmxDTO pcmYddgmxDTO = new PcmYddgmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYddgmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYddgmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDgdq() != null ) {
            pcmYddgmxDTO.setDgdq( entity.getDgdq() );
        }
        if ( entity.getJsrq() != null ) {
            pcmYddgmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getBz() != null ) {
            pcmYddgmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getPcmyddgmxname() != null ) {
            pcmYddgmxDTO.setPcmyddgmxname( entity.getPcmyddgmxname() );
        }
        if ( entity.getDglx() != null ) {
            pcmYddgmxDTO.setDglx( entity.getDglx() );
        }
        if ( entity.getDistirbutionid() != null ) {
            pcmYddgmxDTO.setDistirbutionid( entity.getDistirbutionid() );
        }
        if ( entity.getCz() != null ) {
            pcmYddgmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getReason() != null ) {
            pcmYddgmxDTO.setReason( entity.getReason() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmYddgmxDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getIsfinished() != null ) {
            pcmYddgmxDTO.setIsfinished( entity.getIsfinished() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYddgmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getBmid() != null ) {
            pcmYddgmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getZz() != null ) {
            pcmYddgmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getYrank() != null ) {
            pcmYddgmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYddgmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYddgmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYddgmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYddgmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getYgw() != null ) {
            pcmYddgmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYddgmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYddgmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYddgmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYddgmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getYzw() != null ) {
            pcmYddgmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getShortname() != null ) {
            pcmYddgmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getPcmyddgmxid() != null ) {
            pcmYddgmxDTO.setPcmyddgmxid( entity.getPcmyddgmxid() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYddgmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getNl() != null ) {
            pcmYddgmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYddgmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYddgmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYddgmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getBm() != null ) {
            pcmYddgmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZzid() != null ) {
            pcmYddgmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYddgmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYddgmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYddgmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmYddgmxDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getDgshortname() != null ) {
            pcmYddgmxDTO.setDgshortname( entity.getDgshortname() );
        }

        return pcmYddgmxDTO;
    }

    @Override
    public List<PcmYddgmx> toDomain(List<PcmYddgmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYddgmx> list = new ArrayList<PcmYddgmx>( dtoList.size() );
        for ( PcmYddgmxDTO pcmYddgmxDTO : dtoList ) {
            list.add( toDomain( pcmYddgmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYddgmxDTO> toDto(List<PcmYddgmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYddgmxDTO> list = new ArrayList<PcmYddgmxDTO>( entityList.size() );
        for ( PcmYddgmx pcmYddgmx : entityList ) {
            list.add( toDto( pcmYddgmx ) );
        }

        return list;
    }
}
