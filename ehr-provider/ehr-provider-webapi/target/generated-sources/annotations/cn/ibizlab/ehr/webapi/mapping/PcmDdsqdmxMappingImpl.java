package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmDdsqdmx;
import cn.ibizlab.ehr.webapi.dto.PcmDdsqdmxDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmDdsqdmxMappingImpl implements PcmDdsqdmxMapping {

    @Override
    public PcmDdsqdmx toDomain(PcmDdsqdmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmDdsqdmx pcmDdsqdmx = new PcmDdsqdmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmDdsqdmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmDdsqdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFinishdd() != null ) {
            pcmDdsqdmx.setFinishdd( dto.getFinishdd() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmDdsqdmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getLx() != null ) {
            pcmDdsqdmx.setLx( dto.getLx() );
        }
        if ( dto.getSfgbdd() != null ) {
            pcmDdsqdmx.setSfgbdd( dto.getSfgbdd() );
        }
        if ( dto.getJdjssj() != null ) {
            pcmDdsqdmx.setJdjssj( dto.getJdjssj() );
        }
        if ( dto.getSxrq() != null ) {
            pcmDdsqdmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getSfjzb() != null ) {
            pcmDdsqdmx.setSfjzb( dto.getSfjzb() );
        }
        if ( dto.getDdtype() != null ) {
            pcmDdsqdmx.setDdtype( dto.getDdtype() );
        }
        if ( dto.getRzwj() != null ) {
            pcmDdsqdmx.setRzwj( dto.getRzwj() );
        }
        if ( dto.getPcmddsqdmxname() != null ) {
            pcmDdsqdmx.setPcmddsqdmxname( dto.getPcmddsqdmxname() );
        }
        if ( dto.getJdkssj() != null ) {
            pcmDdsqdmx.setJdkssj( dto.getJdkssj() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmDdsqdmx.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmygw() != null ) {
            pcmDdsqdmx.setOrmygw( dto.getOrmygw() );
        }
        if ( dto.getOrmyzw() != null ) {
            pcmDdsqdmx.setOrmyzw( dto.getOrmyzw() );
        }
        if ( dto.getYgbh() != null ) {
            pcmDdsqdmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmDdsqdmx.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmpostid() != null ) {
            pcmDdsqdmx.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pcmDdsqdmx.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getPcmddsqdid() != null ) {
            pcmDdsqdmx.setPcmddsqdid( dto.getPcmddsqdid() );
        }
        if ( dto.getPimdistirbutionid() != null ) {
            pcmDdsqdmx.setPimdistirbutionid( dto.getPimdistirbutionid() );
        }
        if ( dto.getPcmddsqdmxid() != null ) {
            pcmDdsqdmx.setPcmddsqdmxid( dto.getPcmddsqdmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmDdsqdmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pcmDdsqdmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmDdsqdmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmDdsqdmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimdistirbutionname() != null ) {
            pcmDdsqdmx.setPimdistirbutionname( dto.getPimdistirbutionname() );
        }
        if ( dto.getPcmddsqdname() != null ) {
            pcmDdsqdmx.setPcmddsqdname( dto.getPcmddsqdname() );
        }
        if ( dto.getOrgsectorname() != null ) {
            pcmDdsqdmx.setOrgsectorname( dto.getOrgsectorname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pcmDdsqdmx.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getOrmpostname() != null ) {
            pcmDdsqdmx.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrgname() != null ) {
            pcmDdsqdmx.setOrgname( dto.getOrgname() );
        }
        if ( dto.getOrgid() != null ) {
            pcmDdsqdmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmDdsqdmx.setOrgsectorid( dto.getOrgsectorid() );
        }

        return pcmDdsqdmx;
    }

    @Override
    public PcmDdsqdmxDTO toDto(PcmDdsqdmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmDdsqdmxDTO pcmDdsqdmxDTO = new PcmDdsqdmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmDdsqdmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmDdsqdmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFinishdd() != null ) {
            pcmDdsqdmxDTO.setFinishdd( entity.getFinishdd() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmDdsqdmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getLx() != null ) {
            pcmDdsqdmxDTO.setLx( entity.getLx() );
        }
        if ( entity.getSfgbdd() != null ) {
            pcmDdsqdmxDTO.setSfgbdd( entity.getSfgbdd() );
        }
        if ( entity.getJdjssj() != null ) {
            pcmDdsqdmxDTO.setJdjssj( entity.getJdjssj() );
        }
        if ( entity.getSxrq() != null ) {
            pcmDdsqdmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getSfjzb() != null ) {
            pcmDdsqdmxDTO.setSfjzb( entity.getSfjzb() );
        }
        if ( entity.getDdtype() != null ) {
            pcmDdsqdmxDTO.setDdtype( entity.getDdtype() );
        }
        if ( entity.getRzwj() != null ) {
            pcmDdsqdmxDTO.setRzwj( entity.getRzwj() );
        }
        if ( entity.getPcmddsqdmxname() != null ) {
            pcmDdsqdmxDTO.setPcmddsqdmxname( entity.getPcmddsqdmxname() );
        }
        if ( entity.getJdkssj() != null ) {
            pcmDdsqdmxDTO.setJdkssj( entity.getJdkssj() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmDdsqdmxDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmygw() != null ) {
            pcmDdsqdmxDTO.setOrmygw( entity.getOrmygw() );
        }
        if ( entity.getOrmyzw() != null ) {
            pcmDdsqdmxDTO.setOrmyzw( entity.getOrmyzw() );
        }
        if ( entity.getYgbh() != null ) {
            pcmDdsqdmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmDdsqdmxDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmpostid() != null ) {
            pcmDdsqdmxDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pcmDdsqdmxDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getPcmddsqdid() != null ) {
            pcmDdsqdmxDTO.setPcmddsqdid( entity.getPcmddsqdid() );
        }
        if ( entity.getPimdistirbutionid() != null ) {
            pcmDdsqdmxDTO.setPimdistirbutionid( entity.getPimdistirbutionid() );
        }
        if ( entity.getPcmddsqdmxid() != null ) {
            pcmDdsqdmxDTO.setPcmddsqdmxid( entity.getPcmddsqdmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmDdsqdmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pcmDdsqdmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmDdsqdmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmDdsqdmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimdistirbutionname() != null ) {
            pcmDdsqdmxDTO.setPimdistirbutionname( entity.getPimdistirbutionname() );
        }
        if ( entity.getPcmddsqdname() != null ) {
            pcmDdsqdmxDTO.setPcmddsqdname( entity.getPcmddsqdname() );
        }
        if ( entity.getOrgsectorname() != null ) {
            pcmDdsqdmxDTO.setOrgsectorname( entity.getOrgsectorname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pcmDdsqdmxDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getOrmpostname() != null ) {
            pcmDdsqdmxDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrgname() != null ) {
            pcmDdsqdmxDTO.setOrgname( entity.getOrgname() );
        }
        if ( entity.getOrgid() != null ) {
            pcmDdsqdmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmDdsqdmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }

        return pcmDdsqdmxDTO;
    }

    @Override
    public List<PcmDdsqdmx> toDomain(List<PcmDdsqdmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmDdsqdmx> list = new ArrayList<PcmDdsqdmx>( dtoList.size() );
        for ( PcmDdsqdmxDTO pcmDdsqdmxDTO : dtoList ) {
            list.add( toDomain( pcmDdsqdmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmDdsqdmxDTO> toDto(List<PcmDdsqdmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmDdsqdmxDTO> list = new ArrayList<PcmDdsqdmxDTO>( entityList.size() );
        for ( PcmDdsqdmx pcmDdsqdmx : entityList ) {
            list.add( toDto( pcmDdsqdmx ) );
        }

        return list;
    }
}
