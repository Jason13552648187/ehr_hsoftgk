package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdjdmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdjdmxDTO;
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
public class PcmYdjdmxMappingImpl implements PcmYdjdmxMapping {

    @Override
    public PcmYdjdmx toDomain(PcmYdjdmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdjdmx pcmYdjdmx = new PcmYdjdmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdjdmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdjdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJdjsrq() != null ) {
            pcmYdjdmx.setJdjsrq( dto.getJdjsrq() );
        }
        if ( dto.getJdksrq() != null ) {
            pcmYdjdmx.setJdksrq( dto.getJdksrq() );
        }
        if ( dto.getCz() != null ) {
            pcmYdjdmx.setCz( dto.getCz() );
        }
        if ( dto.getPcmydjdmxname() != null ) {
            pcmYdjdmx.setPcmydjdmxname( dto.getPcmydjdmxname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmYdjdmx.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pcmYdjdmx.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmYdjdmx.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmpostid() != null ) {
            pcmYdjdmx.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getPimdistirbutionid() != null ) {
            pcmYdjdmx.setPimdistirbutionid( dto.getPimdistirbutionid() );
        }
        if ( dto.getIsfinished() != null ) {
            pcmYdjdmx.setIsfinished( dto.getIsfinished() );
        }
        if ( dto.getSyyfColor() != null ) {
            pcmYdjdmx.setSyyfColor( dto.getSyyfColor() );
        }
        if ( dto.getFinished() != null ) {
            pcmYdjdmx.setFinished( dto.getFinished() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdjdmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getJdjsrqColor() != null ) {
            pcmYdjdmx.setJdjsrqColor( dto.getJdjsrqColor() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdjdmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdjdmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getSfjddq() != null ) {
            pcmYdjdmx.setSfjddq( dto.getSfjddq() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdjdmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdjdmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdjdmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZz() != null ) {
            pcmYdjdmx.setZz( dto.getZz() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdjdmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdjdmx.setShortname( dto.getShortname() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdjdmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getBm() != null ) {
            pcmYdjdmx.setBm( dto.getBm() );
        }
        if ( dto.getPcmydjdmxid() != null ) {
            pcmYdjdmx.setPcmydjdmxid( dto.getPcmydjdmxid() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdjdmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdjdmx.setYgw( dto.getYgw() );
        }
        if ( dto.getSyyf() != null ) {
            pcmYdjdmx.setSyyf( dto.getSyyf() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdjdmx.setYrank( dto.getYrank() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdjdmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdjdmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdjdmx.setBmid( dto.getBmid() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdjdmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdjdmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdjdmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdjdmx.setYzw( dto.getYzw() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdjdmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getNl() != null ) {
            pcmYdjdmx.setNl( dto.getNl() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdjdmx.setZzid( dto.getZzid() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdjdmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getJdzzdzs() != null ) {
            pcmYdjdmx.setJdzzdzs( dto.getJdzzdzs() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmYdjdmx.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pcmYdjdmx.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getJdshortname() != null ) {
            pcmYdjdmx.setJdshortname( dto.getJdshortname() );
        }
        if ( dto.getOrmpostname() != null ) {
            pcmYdjdmx.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmYdjdmx.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return pcmYdjdmx;
    }

    @Override
    public PcmYdjdmxDTO toDto(PcmYdjdmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdjdmxDTO pcmYdjdmxDTO = new PcmYdjdmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdjdmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdjdmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJdjsrq() != null ) {
            pcmYdjdmxDTO.setJdjsrq( entity.getJdjsrq() );
        }
        if ( entity.getJdksrq() != null ) {
            pcmYdjdmxDTO.setJdksrq( entity.getJdksrq() );
        }
        if ( entity.getCz() != null ) {
            pcmYdjdmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getPcmydjdmxname() != null ) {
            pcmYdjdmxDTO.setPcmydjdmxname( entity.getPcmydjdmxname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmYdjdmxDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pcmYdjdmxDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmYdjdmxDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmpostid() != null ) {
            pcmYdjdmxDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getPimdistirbutionid() != null ) {
            pcmYdjdmxDTO.setPimdistirbutionid( entity.getPimdistirbutionid() );
        }
        if ( entity.getIsfinished() != null ) {
            pcmYdjdmxDTO.setIsfinished( entity.getIsfinished() );
        }
        if ( entity.getSyyfColor() != null ) {
            pcmYdjdmxDTO.setSyyfColor( entity.getSyyfColor() );
        }
        if ( entity.getFinished() != null ) {
            pcmYdjdmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdjdmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getJdjsrqColor() != null ) {
            pcmYdjdmxDTO.setJdjsrqColor( entity.getJdjsrqColor() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdjdmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdjdmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getSfjddq() != null ) {
            pcmYdjdmxDTO.setSfjddq( entity.getSfjddq() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdjdmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdjdmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdjdmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZz() != null ) {
            pcmYdjdmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdjdmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdjdmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdjdmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getBm() != null ) {
            pcmYdjdmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getPcmydjdmxid() != null ) {
            pcmYdjdmxDTO.setPcmydjdmxid( entity.getPcmydjdmxid() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdjdmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdjdmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getSyyf() != null ) {
            pcmYdjdmxDTO.setSyyf( entity.getSyyf() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdjdmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdjdmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdjdmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdjdmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdjdmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdjdmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdjdmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdjdmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdjdmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getNl() != null ) {
            pcmYdjdmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdjdmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdjdmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getJdzzdzs() != null ) {
            pcmYdjdmxDTO.setJdzzdzs( entity.getJdzzdzs() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmYdjdmxDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pcmYdjdmxDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getJdshortname() != null ) {
            pcmYdjdmxDTO.setJdshortname( entity.getJdshortname() );
        }
        if ( entity.getOrmpostname() != null ) {
            pcmYdjdmxDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmYdjdmxDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return pcmYdjdmxDTO;
    }

    @Override
    public List<PcmYdjdmx> toDomain(List<PcmYdjdmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdjdmx> list = new ArrayList<PcmYdjdmx>( dtoList.size() );
        for ( PcmYdjdmxDTO pcmYdjdmxDTO : dtoList ) {
            list.add( toDomain( pcmYdjdmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdjdmxDTO> toDto(List<PcmYdjdmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdjdmxDTO> list = new ArrayList<PcmYdjdmxDTO>( entityList.size() );
        for ( PcmYdjdmx pcmYdjdmx : entityList ) {
            list.add( toDto( pcmYdjdmx ) );
        }

        return list;
    }
}
