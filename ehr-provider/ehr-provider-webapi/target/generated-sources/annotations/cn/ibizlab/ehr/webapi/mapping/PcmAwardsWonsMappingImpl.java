package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmAwardsWons;
import cn.ibizlab.ehr.webapi.dto.PcmAwardsWonsDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmAwardsWonsMappingImpl implements PcmAwardsWonsMapping {

    @Override
    public PcmAwardsWons toDomain(PcmAwardsWonsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmAwardsWons pcmAwardsWons = new PcmAwardsWons();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmAwardsWons.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmAwardsWons.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getAwardlevel() != null ) {
            pcmAwardsWons.setAwardlevel( dto.getAwardlevel() );
        }
        if ( dto.getFlag() != null ) {
            pcmAwardsWons.setFlag( dto.getFlag() );
        }
        if ( dto.getAwardname() != null ) {
            pcmAwardsWons.setAwardname( dto.getAwardname() );
        }
        if ( dto.getAwardtime() != null ) {
            pcmAwardsWons.setAwardtime( dto.getAwardtime() );
        }
        if ( dto.getAwarddescription() != null ) {
            pcmAwardsWons.setAwarddescription( dto.getAwarddescription() );
        }
        if ( dto.getPcmawardswonsname() != null ) {
            pcmAwardsWons.setPcmawardswonsname( dto.getPcmawardswonsname() );
        }
        if ( dto.getBbsj() != null ) {
            pcmAwardsWons.setBbsj( dto.getBbsj() );
        }
        if ( dto.getJudgeorg() != null ) {
            pcmAwardsWons.setJudgeorg( dto.getJudgeorg() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmAwardsWons.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmAwardsWons.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmAwardsWons.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmawardswonsid() != null ) {
            pcmAwardsWons.setPcmawardswonsid( dto.getPcmawardswonsid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmAwardsWons.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmAwardsWons.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmAwardsWons.setCertificatenumber( dto.getCertificatenumber() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmAwardsWons.setPcmprofilename( dto.getPcmprofilename() );
        }

        return pcmAwardsWons;
    }

    @Override
    public PcmAwardsWonsDTO toDto(PcmAwardsWons entity) {
        if ( entity == null ) {
            return null;
        }

        PcmAwardsWonsDTO pcmAwardsWonsDTO = new PcmAwardsWonsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmAwardsWonsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmAwardsWonsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getAwardlevel() != null ) {
            pcmAwardsWonsDTO.setAwardlevel( entity.getAwardlevel() );
        }
        if ( entity.getFlag() != null ) {
            pcmAwardsWonsDTO.setFlag( entity.getFlag() );
        }
        if ( entity.getAwardname() != null ) {
            pcmAwardsWonsDTO.setAwardname( entity.getAwardname() );
        }
        if ( entity.getAwardtime() != null ) {
            pcmAwardsWonsDTO.setAwardtime( entity.getAwardtime() );
        }
        if ( entity.getAwarddescription() != null ) {
            pcmAwardsWonsDTO.setAwarddescription( entity.getAwarddescription() );
        }
        if ( entity.getPcmawardswonsname() != null ) {
            pcmAwardsWonsDTO.setPcmawardswonsname( entity.getPcmawardswonsname() );
        }
        if ( entity.getBbsj() != null ) {
            pcmAwardsWonsDTO.setBbsj( entity.getBbsj() );
        }
        if ( entity.getJudgeorg() != null ) {
            pcmAwardsWonsDTO.setJudgeorg( entity.getJudgeorg() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmAwardsWonsDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmAwardsWonsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmAwardsWonsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmawardswonsid() != null ) {
            pcmAwardsWonsDTO.setPcmawardswonsid( entity.getPcmawardswonsid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmAwardsWonsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmAwardsWonsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmAwardsWonsDTO.setCertificatenumber( entity.getCertificatenumber() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmAwardsWonsDTO.setPcmprofilename( entity.getPcmprofilename() );
        }

        return pcmAwardsWonsDTO;
    }

    @Override
    public List<PcmAwardsWons> toDomain(List<PcmAwardsWonsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmAwardsWons> list = new ArrayList<PcmAwardsWons>( dtoList.size() );
        for ( PcmAwardsWonsDTO pcmAwardsWonsDTO : dtoList ) {
            list.add( toDomain( pcmAwardsWonsDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmAwardsWonsDTO> toDto(List<PcmAwardsWons> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmAwardsWonsDTO> list = new ArrayList<PcmAwardsWonsDTO>( entityList.size() );
        for ( PcmAwardsWons pcmAwardsWons : entityList ) {
            list.add( toDto( pcmAwardsWons ) );
        }

        return list;
    }
}
