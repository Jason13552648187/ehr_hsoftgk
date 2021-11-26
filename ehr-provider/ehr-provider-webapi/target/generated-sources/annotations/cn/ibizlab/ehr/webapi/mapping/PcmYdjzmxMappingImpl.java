package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdjzmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdjzmxDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdjzmxMappingImpl implements PcmYdjzmxMapping {

    @Override
    public PcmYdjzmx toDomain(PcmYdjzmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdjzmx pcmYdjzmx = new PcmYdjzmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdjzmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdjzmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getCz() != null ) {
            pcmYdjzmx.setCz( dto.getCz() );
        }
        if ( dto.getPimdistirbutionid() != null ) {
            pcmYdjzmx.setPimdistirbutionid( dto.getPimdistirbutionid() );
        }
        if ( dto.getJsrq() != null ) {
            pcmYdjzmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getKsrq() != null ) {
            pcmYdjzmx.setKsrq( dto.getKsrq() );
        }
        if ( dto.getPcmydjzmxname() != null ) {
            pcmYdjzmx.setPcmydjzmxname( dto.getPcmydjzmxname() );
        }
        if ( dto.getOrmpostid() != null ) {
            pcmYdjzmx.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmYdjzmx.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pcmYdjzmx.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmYdjzmx.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getIsfinished() != null ) {
            pcmYdjzmx.setIsfinished( dto.getIsfinished() );
        }
        if ( dto.getBm() != null ) {
            pcmYdjzmx.setBm( dto.getBm() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdjzmx.setZzid( dto.getZzid() );
        }
        if ( dto.getPcmydjzmxid() != null ) {
            pcmYdjzmx.setPcmydjzmxid( dto.getPcmydjzmxid() );
        }
        if ( dto.getSfdq() != null ) {
            pcmYdjzmx.setSfdq( dto.getSfdq() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdjzmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdjzmx.setBmid( dto.getBmid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdjzmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdjzmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdjzmx.setYzw( dto.getYzw() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdjzmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdjzmx.setYrank( dto.getYrank() );
        }
        if ( dto.getNl() != null ) {
            pcmYdjzmx.setNl( dto.getNl() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdjzmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getZz() != null ) {
            pcmYdjzmx.setZz( dto.getZz() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdjzmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdjzmx.setShortname( dto.getShortname() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdjzmx.setYgw( dto.getYgw() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdjzmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdjzmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdjzmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdjzmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getSyyf() != null ) {
            pcmYdjzmx.setSyyf( dto.getSyyf() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdjzmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdjzmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getSyyfColor() != null ) {
            pcmYdjzmx.setSyyfColor( dto.getSyyfColor() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdjzmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdjzmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdjzmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdjzmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmpostname() != null ) {
            pcmYdjzmx.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmYdjzmx.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pcmYdjzmx.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getJzshortname() != null ) {
            pcmYdjzmx.setJzshortname( dto.getJzshortname() );
        }
        if ( dto.getJzzzdzs() != null ) {
            pcmYdjzmx.setJzzzdzs( dto.getJzzzdzs() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmYdjzmx.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return pcmYdjzmx;
    }

    @Override
    public PcmYdjzmxDTO toDto(PcmYdjzmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdjzmxDTO pcmYdjzmxDTO = new PcmYdjzmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdjzmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdjzmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getCz() != null ) {
            pcmYdjzmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getPimdistirbutionid() != null ) {
            pcmYdjzmxDTO.setPimdistirbutionid( entity.getPimdistirbutionid() );
        }
        if ( entity.getJsrq() != null ) {
            pcmYdjzmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getKsrq() != null ) {
            pcmYdjzmxDTO.setKsrq( entity.getKsrq() );
        }
        if ( entity.getPcmydjzmxname() != null ) {
            pcmYdjzmxDTO.setPcmydjzmxname( entity.getPcmydjzmxname() );
        }
        if ( entity.getOrmpostid() != null ) {
            pcmYdjzmxDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmYdjzmxDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pcmYdjzmxDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmYdjzmxDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getIsfinished() != null ) {
            pcmYdjzmxDTO.setIsfinished( entity.getIsfinished() );
        }
        if ( entity.getBm() != null ) {
            pcmYdjzmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdjzmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getPcmydjzmxid() != null ) {
            pcmYdjzmxDTO.setPcmydjzmxid( entity.getPcmydjzmxid() );
        }
        if ( entity.getSfdq() != null ) {
            pcmYdjzmxDTO.setSfdq( entity.getSfdq() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdjzmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdjzmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdjzmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdjzmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdjzmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdjzmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdjzmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getNl() != null ) {
            pcmYdjzmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdjzmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getZz() != null ) {
            pcmYdjzmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdjzmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdjzmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdjzmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdjzmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdjzmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdjzmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdjzmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getSyyf() != null ) {
            pcmYdjzmxDTO.setSyyf( entity.getSyyf() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdjzmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdjzmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getSyyfColor() != null ) {
            pcmYdjzmxDTO.setSyyfColor( entity.getSyyfColor() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdjzmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdjzmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdjzmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdjzmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmpostname() != null ) {
            pcmYdjzmxDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmYdjzmxDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pcmYdjzmxDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getJzshortname() != null ) {
            pcmYdjzmxDTO.setJzshortname( entity.getJzshortname() );
        }
        if ( entity.getJzzzdzs() != null ) {
            pcmYdjzmxDTO.setJzzzdzs( entity.getJzzzdzs() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmYdjzmxDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return pcmYdjzmxDTO;
    }

    @Override
    public List<PcmYdjzmx> toDomain(List<PcmYdjzmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdjzmx> list = new ArrayList<PcmYdjzmx>( dtoList.size() );
        for ( PcmYdjzmxDTO pcmYdjzmxDTO : dtoList ) {
            list.add( toDomain( pcmYdjzmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdjzmxDTO> toDto(List<PcmYdjzmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdjzmxDTO> list = new ArrayList<PcmYdjzmxDTO>( entityList.size() );
        for ( PcmYdjzmx pcmYdjzmx : entityList ) {
            list.add( toDto( pcmYdjzmx ) );
        }

        return list;
    }
}
