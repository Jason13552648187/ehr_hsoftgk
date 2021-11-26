package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmBdsqdmx;
import cn.ibizlab.ehr.webapi.dto.PcmBdsqdmxDTO;
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
public class PcmBdsqdmxMappingImpl implements PcmBdsqdmxMapping {

    @Override
    public PcmBdsqdmx toDomain(PcmBdsqdmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmBdsqdmx pcmBdsqdmx = new PcmBdsqdmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmBdsqdmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmBdsqdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFj() != null ) {
            pcmBdsqdmx.setFj( dto.getFj() );
        }
        if ( dto.getSfmz() != null ) {
            pcmBdsqdmx.setSfmz( dto.getSfmz() );
        }
        if ( dto.getGzkssj() != null ) {
            pcmBdsqdmx.setGzkssj( dto.getGzkssj() );
        }
        if ( dto.getLzfj() != null ) {
            pcmBdsqdmx.setLzfj( dto.getLzfj() );
        }
        if ( dto.getFinished() != null ) {
            pcmBdsqdmx.setFinished( dto.getFinished() );
        }
        if ( dto.getPcje() != null ) {
            pcmBdsqdmx.setPcje( dto.getPcje() );
        }
        if ( dto.getLzyy() != null ) {
            pcmBdsqdmx.setLzyy( dto.getLzyy() );
        }
        if ( dto.getWfresult() != null ) {
            pcmBdsqdmx.setWfresult( dto.getWfresult() );
        }
        if ( dto.getLdzytype() != null ) {
            pcmBdsqdmx.setLdzytype( dto.getLdzytype() );
        }
        if ( dto.getLzqx() != null ) {
            pcmBdsqdmx.setLzqx( dto.getLzqx() );
        }
        if ( dto.getSxrq() != null ) {
            pcmBdsqdmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getLzsj() != null ) {
            pcmBdsqdmx.setLzsj( dto.getLzsj() );
        }
        if ( dto.getRzwh() != null ) {
            pcmBdsqdmx.setRzwh( dto.getRzwh() );
        }
        if ( dto.getGzzt() != null ) {
            pcmBdsqdmx.setGzzt( dto.getGzzt() );
        }
        if ( dto.getSfjrhmd() != null ) {
            pcmBdsqdmx.setSfjrhmd( dto.getSfjrhmd() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmBdsqdmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getSftsdd() != null ) {
            pcmBdsqdmx.setSftsdd( dto.getSftsdd() );
        }
        if ( dto.getLx() != null ) {
            pcmBdsqdmx.setLx( dto.getLx() );
        }
        if ( dto.getSfzflzbcj() != null ) {
            pcmBdsqdmx.setSfzflzbcj( dto.getSfzflzbcj() );
        }
        if ( dto.getPcmbdsqdmxname() != null ) {
            pcmBdsqdmx.setPcmbdsqdmxname( dto.getPcmbdsqdmxname() );
        }
        if ( dto.getBz() != null ) {
            pcmBdsqdmx.setBz( dto.getBz() );
        }
        if ( dto.getSfldzy() != null ) {
            pcmBdsqdmx.setSfldzy( dto.getSfldzy() );
        }
        if ( dto.getBcjse() != null ) {
            pcmBdsqdmx.setBcjse( dto.getBcjse() );
        }
        if ( dto.getXrank() != null ) {
            pcmBdsqdmx.setXrank( dto.getXrank() );
        }
        if ( dto.getGzjssj() != null ) {
            pcmBdsqdmx.setGzjssj( dto.getGzjssj() );
        }
        if ( dto.getDglx() != null ) {
            pcmBdsqdmx.setDglx( dto.getDglx() );
        }
        if ( dto.getZjhm() != null ) {
            pcmBdsqdmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmBdsqdmx.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getLzmtr() != null ) {
            pcmBdsqdmx.setLzmtr( dto.getLzmtr() );
        }
        if ( dto.getLxdh() != null ) {
            pcmBdsqdmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getOrmpostname() != null ) {
            pcmBdsqdmx.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getBm() != null ) {
            pcmBdsqdmx.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            pcmBdsqdmx.setZz( dto.getZz() );
        }
        if ( dto.getZzid() != null ) {
            pcmBdsqdmx.setZzid( dto.getZzid() );
        }
        if ( dto.getRank() != null ) {
            pcmBdsqdmx.setRank( dto.getRank() );
        }
        if ( dto.getYgbh() != null ) {
            pcmBdsqdmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getBmid() != null ) {
            pcmBdsqdmx.setBmid( dto.getBmid() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmBdsqdmx.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getYzw() != null ) {
            pcmBdsqdmx.setYzw( dto.getYzw() );
        }
        if ( dto.getYgw() != null ) {
            pcmBdsqdmx.setYgw( dto.getYgw() );
        }
        if ( dto.getNl() != null ) {
            pcmBdsqdmx.setNl( dto.getNl() );
        }
        if ( dto.getOrmorgsectorid2() != null ) {
            pcmBdsqdmx.setOrmorgsectorid2( dto.getOrmorgsectorid2() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pcmBdsqdmx.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getPcmbdsqdid() != null ) {
            pcmBdsqdmx.setPcmbdsqdid( dto.getPcmbdsqdid() );
        }
        if ( dto.getLzmtrid() != null ) {
            pcmBdsqdmx.setLzmtrid( dto.getLzmtrid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmBdsqdmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmBdsqdmx.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmpostid() != null ) {
            pcmBdsqdmx.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmBdsqdmx.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmBdsqdmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmBdsqdmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pcmBdsqdmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPcmbdsqdmxid() != null ) {
            pcmBdsqdmx.setPcmbdsqdmxid( dto.getPcmbdsqdmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmBdsqdmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmBdsqdmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmBdsqdmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgsectorname2() != null ) {
            pcmBdsqdmx.setOrmorgsectorname2( dto.getOrmorgsectorname2() );
        }
        if ( dto.getZzmm() != null ) {
            pcmBdsqdmx.setZzmm( dto.getZzmm() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmBdsqdmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pcmBdsqdmx.setOrmdutyname( dto.getOrmdutyname() );
        }

        return pcmBdsqdmx;
    }

    @Override
    public PcmBdsqdmxDTO toDto(PcmBdsqdmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmBdsqdmxDTO pcmBdsqdmxDTO = new PcmBdsqdmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmBdsqdmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmBdsqdmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFj() != null ) {
            pcmBdsqdmxDTO.setFj( entity.getFj() );
        }
        if ( entity.getSfmz() != null ) {
            pcmBdsqdmxDTO.setSfmz( entity.getSfmz() );
        }
        if ( entity.getGzkssj() != null ) {
            pcmBdsqdmxDTO.setGzkssj( entity.getGzkssj() );
        }
        if ( entity.getLzfj() != null ) {
            pcmBdsqdmxDTO.setLzfj( entity.getLzfj() );
        }
        if ( entity.getFinished() != null ) {
            pcmBdsqdmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getPcje() != null ) {
            pcmBdsqdmxDTO.setPcje( entity.getPcje() );
        }
        if ( entity.getLzyy() != null ) {
            pcmBdsqdmxDTO.setLzyy( entity.getLzyy() );
        }
        if ( entity.getWfresult() != null ) {
            pcmBdsqdmxDTO.setWfresult( entity.getWfresult() );
        }
        if ( entity.getLdzytype() != null ) {
            pcmBdsqdmxDTO.setLdzytype( entity.getLdzytype() );
        }
        if ( entity.getLzqx() != null ) {
            pcmBdsqdmxDTO.setLzqx( entity.getLzqx() );
        }
        if ( entity.getSxrq() != null ) {
            pcmBdsqdmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getLzsj() != null ) {
            pcmBdsqdmxDTO.setLzsj( entity.getLzsj() );
        }
        if ( entity.getRzwh() != null ) {
            pcmBdsqdmxDTO.setRzwh( entity.getRzwh() );
        }
        if ( entity.getGzzt() != null ) {
            pcmBdsqdmxDTO.setGzzt( entity.getGzzt() );
        }
        if ( entity.getSfjrhmd() != null ) {
            pcmBdsqdmxDTO.setSfjrhmd( entity.getSfjrhmd() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmBdsqdmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getSftsdd() != null ) {
            pcmBdsqdmxDTO.setSftsdd( entity.getSftsdd() );
        }
        if ( entity.getLx() != null ) {
            pcmBdsqdmxDTO.setLx( entity.getLx() );
        }
        if ( entity.getSfzflzbcj() != null ) {
            pcmBdsqdmxDTO.setSfzflzbcj( entity.getSfzflzbcj() );
        }
        if ( entity.getPcmbdsqdmxname() != null ) {
            pcmBdsqdmxDTO.setPcmbdsqdmxname( entity.getPcmbdsqdmxname() );
        }
        if ( entity.getBz() != null ) {
            pcmBdsqdmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getSfldzy() != null ) {
            pcmBdsqdmxDTO.setSfldzy( entity.getSfldzy() );
        }
        if ( entity.getBcjse() != null ) {
            pcmBdsqdmxDTO.setBcjse( entity.getBcjse() );
        }
        if ( entity.getXrank() != null ) {
            pcmBdsqdmxDTO.setXrank( entity.getXrank() );
        }
        if ( entity.getGzjssj() != null ) {
            pcmBdsqdmxDTO.setGzjssj( entity.getGzjssj() );
        }
        if ( entity.getDglx() != null ) {
            pcmBdsqdmxDTO.setDglx( entity.getDglx() );
        }
        if ( entity.getZjhm() != null ) {
            pcmBdsqdmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmBdsqdmxDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getLzmtr() != null ) {
            pcmBdsqdmxDTO.setLzmtr( entity.getLzmtr() );
        }
        if ( entity.getLxdh() != null ) {
            pcmBdsqdmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getOrmpostname() != null ) {
            pcmBdsqdmxDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getBm() != null ) {
            pcmBdsqdmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            pcmBdsqdmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getZzid() != null ) {
            pcmBdsqdmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getRank() != null ) {
            pcmBdsqdmxDTO.setRank( entity.getRank() );
        }
        if ( entity.getYgbh() != null ) {
            pcmBdsqdmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getBmid() != null ) {
            pcmBdsqdmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmBdsqdmxDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getYzw() != null ) {
            pcmBdsqdmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getYgw() != null ) {
            pcmBdsqdmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getNl() != null ) {
            pcmBdsqdmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getOrmorgsectorid2() != null ) {
            pcmBdsqdmxDTO.setOrmorgsectorid2( entity.getOrmorgsectorid2() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pcmBdsqdmxDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getPcmbdsqdid() != null ) {
            pcmBdsqdmxDTO.setPcmbdsqdid( entity.getPcmbdsqdid() );
        }
        if ( entity.getLzmtrid() != null ) {
            pcmBdsqdmxDTO.setLzmtrid( entity.getLzmtrid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmBdsqdmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmBdsqdmxDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmpostid() != null ) {
            pcmBdsqdmxDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmBdsqdmxDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmBdsqdmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmBdsqdmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pcmBdsqdmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPcmbdsqdmxid() != null ) {
            pcmBdsqdmxDTO.setPcmbdsqdmxid( entity.getPcmbdsqdmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmBdsqdmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmBdsqdmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmBdsqdmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgsectorname2() != null ) {
            pcmBdsqdmxDTO.setOrmorgsectorname2( entity.getOrmorgsectorname2() );
        }
        if ( entity.getZzmm() != null ) {
            pcmBdsqdmxDTO.setZzmm( entity.getZzmm() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmBdsqdmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pcmBdsqdmxDTO.setOrmdutyname( entity.getOrmdutyname() );
        }

        return pcmBdsqdmxDTO;
    }

    @Override
    public List<PcmBdsqdmx> toDomain(List<PcmBdsqdmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmBdsqdmx> list = new ArrayList<PcmBdsqdmx>( dtoList.size() );
        for ( PcmBdsqdmxDTO pcmBdsqdmxDTO : dtoList ) {
            list.add( toDomain( pcmBdsqdmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmBdsqdmxDTO> toDto(List<PcmBdsqdmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmBdsqdmxDTO> list = new ArrayList<PcmBdsqdmxDTO>( entityList.size() );
        for ( PcmBdsqdmx pcmBdsqdmx : entityList ) {
            list.add( toDto( pcmBdsqdmx ) );
        }

        return list;
    }
}
